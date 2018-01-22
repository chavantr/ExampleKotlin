package com.mywings.pay.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import kotlinx.android.synthetic.main.upload_docs_fragment.view.*

class UploadDocsFragment : BaseFragment() {
    private lateinit var uploadDocs: View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        uploadDocs = inflater.inflate(R.layout.upload_docs_fragment, container, false)
        uploadDocs.btnUploadFile.setOnClickListener({
            val intent = Intent(Intent.ACTION_GET_CONTENT).setType("file/*")
            startActivityForResult(intent, LAUNCH_DOC)
        })
        return uploadDocs
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (resultCode) {
            Activity.RESULT_OK -> {
                when (requestCode) {
                    LAUNCH_DOC -> {
                    }
                }
            }
        }
    }
    companion object {
        const val LAUNCH_DOC = 101
    }
}
