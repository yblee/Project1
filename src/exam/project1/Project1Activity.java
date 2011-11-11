package exam.project1;

import java.util.*;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;


public class Project1Activity extends Activity    {
    /** Called when the activity is first created. */
	
	Calendar calendar;
	private Button GpsSet;
	private Button TimeSet;
	private Button OptionSet;
	
	//---------onCreate 부분--------//
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        
        GpsSet =(Button)findViewById(R.id.Gps);
        TimeSet = (Button)findViewById(R.id.Timeline);
        OptionSet = (Button)findViewById(R.id.Option);

        GpsSet.setOnClickListener(new OnClickListener(){
        	@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
//	   ---------인텐드 주는 부분------------//
			//	Intent intent = new Intent(Project1Activity.this, GPS.class);
			//	startActivity(intent);
				
//	   ---------인텐드 끝나는 부분------------//				
				
/*			---------커스텀 다이얼로그 시작(Eror)------------
				showDialog(1);
		    ---------커스텀 다이얼로그 시작(Eror)------------*/
							
			}
    
        });
   
        TimeSet.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        	
        		
// 		   ---------인텐드 주는 부분------------//
        		Intent i = new Intent(Project1Activity.this, TimeSet.class);
        		startActivity(i);
// 		   ---------인텐드 끝나는 부분------------//				
        		
        	}
        });
    }
    	
    	
//-----------화면부분끝------------------//
    /*
   protected Dialog onCreateDialog(int id){
	   super.onCreateDialog(id);
	
	AlertDialog alertDialog;
	AlertDialog.Builder builder;
	Dialog dialog;
	
	Context mContext = getApplicationContext();
	LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
	View layout = inflater.inflate(R.layout.gps, (ViewGroup)findViewById(R.id.root));

	TextView text = (TextView)findViewById(R.id.textview);
	EditText text2 = (EditText)findViewById(R.id.SearchD);
	
	//text.setText("gps로 설정하기");
	
	builder = new AlertDialog.Builder(mContext);
	builder.setView(layout);
	
	alertDialog = builder.create();	
	   
	dialog = alertDialog;
	
	return dialog;
   }

   

private View createCustomView() {
	// TODO Auto-generated method stub
	return null;
}*/
    
}
    

/*   2번쨰방법 알아야한다
  // XML로 정의된 뷰를 얻습니다.

String service = Context.LAYOUT_INFLATER_SERVICE;
LayoutInflater li = (LayoutInflater)getSystemService(service);
View view = li.inflate(R.layout.customdialog,
		   				 (ViewGroup)findViewById(R.id.layout_root));


// 위에서 얻은 뷰를 다이얼로그 박스에 적용합니다.
  AlertDialog.Builder builder = new AlertDialog.Builder(this);
  
*/
    
        
     
