package com.mywings.pay

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.mywings.pay.fragments.*
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.app_bar_dashboard.*

class DashboardActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.dashboard, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_update_profile -> {
                addFragment("profile", ProfileFragment())
            }
            R.id.nav_upload_document -> {
                addFragment("upload", UploadDocsFragment())
            }
            R.id.nav_search -> {
                addFragment("search", SearchFragment())
            }
            R.id.nav_add_money -> {
                addFragment("add_money", AddMoneyFragment())
            }
            R.id.nav_transfer -> {

                addFragment("transfer_money", TransferMoneyFragment())
            }
            R.id.nav_history -> {
                addFragment("history", TransactionHistoryFragment())
            }
            R.id.nav_search_map -> {
                addFragment("search_map", SearchOnMapFragment())
            }
            R.id.nav_loan -> {
                addFragment("loan", LoanFragment())
            }

            R.id.nav_user_request -> {
                addFragment("user_request", ViewRequestFragment())
            }

            R.id.nav_send_qr_code -> {
                addFragment("send_code", SendQrCodeFragment())
            }

            R.id.nav_add_atm -> {
                addFragment("add_atm", AddAtmLocationFragment())
            }

            R.id.nav_view_loan_request -> {
                addFragment("loan_request", LoanRequirementFragment())
            }

            R.id.nav_view_users -> {
                addFragment("view_user", ViewUserInfoFragment())
            }

        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun addFragment(tag: String?, fragment: Fragment?) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment, fragment)
        fragmentTransaction.addToBackStack(tag)
        fragmentTransaction.commit()
    }
}
