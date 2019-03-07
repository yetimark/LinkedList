package com.example.linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        System.out.println("***Linked List***");
        LinkedList myLinks = new LinkedList();
        myLinks.AddEnd(1);
        myLinks.AddEnd(2);
        myLinks.AddEnd(3);
        myLinks.AddEnd(4);
        myLinks.Display();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
