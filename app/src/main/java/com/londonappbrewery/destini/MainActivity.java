package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTop_button;
    Button mBottom_button;
    int mIndex=0;

    Story[] storyArray = {new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
    new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
    new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            mIndex = savedInstanceState.getInt("IndexKey");
        }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTop_button = findViewById(R.id.buttonTop);
        mBottom_button = findViewById(R.id.buttonBottom);

        mStoryTextView.setText(storyArray[mIndex].getText());
        mTop_button.setText(storyArray[mIndex].getTop_button_text());
        mBottom_button.setText(storyArray[mIndex].getBottom_button_text());

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndex==0){
                    mIndex=2;
                    mStoryTextView.setText(storyArray[mIndex].getText());
                    mTop_button.setText(storyArray[mIndex].getTop_button_text());
                    mBottom_button.setText(storyArray[mIndex].getBottom_button_text());
                } else if(mIndex==2){
                    mIndex=6;
                    mStoryTextView.setText(R.string.T6_End);
                    mTop_button.setVisibility(View.GONE);
                    mBottom_button.setVisibility(View.GONE);
                } else if(mIndex==1) {
                    mIndex = 2;
                    mStoryTextView.setText(storyArray[mIndex].getText());
                    mTop_button.setText(storyArray[mIndex].getTop_button_text());
                    mBottom_button.setText(storyArray[mIndex].getBottom_button_text());
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndex==0){
                    mIndex=1;
                    mStoryTextView.setText(storyArray[mIndex].getText());
                    mTop_button.setText(storyArray[mIndex].getTop_button_text());
                    mBottom_button.setText(storyArray[mIndex].getBottom_button_text());
                } else if(mIndex==1){
                    mIndex = 4;
                    mStoryTextView.setText(R.string.T4_End);
                    mTop_button.setVisibility(View.GONE);
                    mBottom_button.setVisibility(View.GONE);
                } else if(mIndex==2){
                    mIndex = 5;
                    mStoryTextView.setText(R.string.T5_End);
                    mTop_button.setVisibility(View.GONE);
                    mBottom_button.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle state){
        super.onSaveInstanceState(state);
        state.putInt("IndexKey",mIndex);
    }
}
