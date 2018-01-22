package com.mywings.pay.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import com.mywings.pay.R
import kotlinx.android.synthetic.main.fragment_search.view.*


class SearchFragment : BaseFragment() {
    private lateinit var searchFragment: View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        searchFragment = inflater.inflate(R.layout.fragment_search, container, false)
        searchFragment.txtSearch.setOnEditorActionListener(searchEvent)
        return searchFragment
    }
    private val searchEvent = TextView.OnEditorActionListener { _, actionId, _ ->
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            return@OnEditorActionListener true
        }
        false
    }
}
