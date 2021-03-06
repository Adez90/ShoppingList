package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class ItemDetailActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_detail);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		if (savedInstanceState == null) {
			Bundle arguments = new Bundle();
			
			arguments.putString(ItemDetailFragment.ARG_ITEM_ID, getIntent().getStringExtra(ItemDetailFragment.ARG_ITEM_ID));
			ItemDetailFragment fragment = new ItemDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction().add(R.id.item_detail_container, fragment).commit();
		}
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
	int id = item.getItemId();
	if (id == android.R.id.home) {
	    NavUtils.navigateUpTo(this,new Intent(this, ItemListActivity.class));
	    return true;
	}
	
	return super.onOptionsItemSelected(item);
    }
}
