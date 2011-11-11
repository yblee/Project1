package exam.project1;

import java.util.*;

import android.app.*;
import android.os.*;
import android.widget.*;

public class TimeSet extends Activity {

	Calendar calendar;
	int mHour;
	int mMin;
	TimePickerDialog timepickerdialog;
	TimePicker timepicker;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeset);
        
        calendar = new GregorianCalendar();
        mHour = calendar.get(calendar.HOUR_OF_DAY);
        mMin  = calendar.get(calendar.MINUTE);
        
        
        
        new TimePickerDialog(this, null, mHour, mMin, false).show();	//이것을 커스텀 다이일러그에 넣고 TimeSet.java에 커스텀 다일얼러그넣기
        //성공                  new TimePickerDialog(this, null, mHour, mMin, false).show(); 할것!!!=이것을 커스텀 다이일러그에 넣고 TimeSet.java에 커스텀 다일얼러그넣기
        //이렇게는 Type 오류  TimePickerDialog timepickerdialog = new TimePickerDialog(this, null, timepicker.getCurrentHour(), timepicker.getCurrentMinute(), false).show();	//이것을 커스텀 다이일러그에 넣고 TimeSet.java에 커스텀 다일얼러그넣기
        
	}
//--------------------------onCreate End---------------------

	

}
