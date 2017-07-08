package com.example.archit.androidtutorial;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String []items = { "History","Life Cycle", "Orientation","Log Class","Event Handling",
            "Button","Toast","Context","Dimensions","View & View Group","Layout Inflator",
            "Margin","Padding","Text View","Edit Text","AutoComplete TextView",
            "Check Box","Radio Button",
            "Layouts","Linear Layout","Relative Layout","Table Layout","Grid Layout","Frame Layout",
            "Dialog Box","Alert Dialog","DatePicker Dialog","TimePicker Dialog",
            "Adaptor View","List View","Intent"};

    String []info = {"Android is a Mobile Operating System developed by Google, based on Linux Kernal "+
            "Its designed primarily for touchscreen mobile devices such as smartphones and tablets.",
            "OnCreate() -> OnStart() -> OnResume() -> OnPause() -> OnStop() -> OnDestroy()",
            "There are two types of Orientation in android Portrait and LandScape "+
                    "On changing the Orientation the activity restarts",
            "Log class is mainly used for debugging purpose. Methods Used: Log.e, Log.i, Log.v, Log.d, Log.w",
            "Event handling can be done in two Ways : XML and JAVA",
            "A button consists of text or an icon or both that communicates what action " +
                    "occurs when the user touches it.We have different types of buttons: Radio,Image,Toggle",
            "TOAST CLASS is used to broadcast any msg on any specific event " +
                    "it uses a static method MakeText() which takes three parameter: " +
                    "Toast.MakeText(Context,Message,duration)",
            "Context is an abstract class which helps convey the msg in different classes. " +
                    "It helps in transfering data from one activity to other.",
            "Match parent is a dimentional unit which occupies complete space as the parent has. " +
                    "Wrap content is also a dimnetional unit which occupies the space as per requirement.",
            "VIEWGROUP is a object which is responsible for arranging the components(View) in different manner.",
            "Layout Inflator helps us to convert a xml file into java object",
            "Margin indicates the gap between boundary of UI component and its neighbour.",
            "Padding is gap between boundary and internal content.",
            "A user Interface element that displays text to the user.",
            "It is similar to text View. Additional feature is that it is user editable.",
            "It Helps to show different items of same initial characters when we pass these " +
                    "characters in autocompletetextview.It basically gives suggestions from a defined dictionary source",
            "Allows the user to select one or more options from a set of available options.",
            "Text along with a radio check button. We need to group all radio buttons" +
                    " together to put constraint that only one of them can be selected.",
            "TYPES OF VIEW GROUPS: Linear, Relative, Table, Grid, Frame ,Constant",
            "Is a basic layout which arrange the diff components either in veritcal form " +
                    " or in horizontal form. " +
                    "By default it is horizontal.",
            "It is also a basic layout which arranges the views with respect to its parent or its neighbours.",
            "Arrange the views in tabular form ( rows and colums). " +
                    "We add components with help of TableRow tag." +
                    "By default it is at machparent(width) and wrapcontent(Height).",
            "It is a layout which arranges the views in tabular form. It is similar to table layout " +
                    ",but here we can define number of rows and columns by the attribute " +
                    "Row count, column count",
            "arrange the components in form of stack.",
            "is a window which is used to show some message or information or any specifc action. " +
                    "Types: Alert Dialog, Date picker, Time Picker, Progress bar.",
            "The class used to create dialog box is AlertDialog.Builder ." +
                    " Structure of Dialog Box ( 3 parts ): Title Bar Area( Icon + Title ), " +
                    "Message Area(msg), Button Area(Some buttons like yes no, we can have 0-3 buttons)",
            "dialog box contians a calender in which user can select date and save that or show to textview. " +
                    " Current date can be fetched from device with Calander class.",
            "We use the calender class to extract current system time." +
                    " We use TimePicker class, it has 5 parameters: " +
                    "(Context,Listener,hh,mi,24hour)",
            "Adapter is a class. Its a View which can carry multiple data. Typesof Adapter: " +
                    "ListView, GridView, Spinner. " +
                    "Adapter takes data from data source makes, the packet or layout and passes or broadcastst it.",
            "It is a adaptor View. It Can hold Multiple data or items. It has" +
                    "Three parameters: (Context,View,DataSource).",
            "INTENT is like a messenger which carries some information/message and helps us to move from one " +
                    "Component to any other component( Activity / Service / Broadcast Reciever)."+
                    "There are two types of Intent: Implicit and Explicit."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int data = getIntent().getIntExtra("position",0);

        ImageView image = (ImageView) findViewById(R.id.image);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);

        tv1.setText(items[data]);
        tv2.setText(info[data]);

    }
}
