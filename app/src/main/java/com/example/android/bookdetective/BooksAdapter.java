package com.example.android.bookdetective;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Adam Cadmon on 2017. 06. 07..
 */

/**
 * {@link BooksAdapter} can provide the layout for each list item
 * based on a data source, which is a list of {@link Book} objects.
 */

public class BooksAdapter extends ArrayAdapter<Book> {

    public BooksAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        Book book = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView title = (TextView) view.findViewById(R.id.title);
        TextView author = (TextView) view.findViewById(R.id.author);
        title.setText(book.getTitle());
        author.setText(book.getAuthor());

        return view;
    }
}