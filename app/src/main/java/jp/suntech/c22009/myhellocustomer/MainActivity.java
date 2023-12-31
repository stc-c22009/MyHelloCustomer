package jp.suntech.c22009.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタン・オブジェクトの用意
        Button btClick=findViewById(R.id.btPrint);
        //リスナ・オブジェクトの用意
        HelloListener listener=new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);
        //クリアボタンであるButtonオブジェクトを取得
        Button btNClear=findViewById(R.id.btNclear);
        Button btAClear=findViewById(R.id.btPaclear);
        //クリアボタンにリスナを設定
        btNClear.setOnClickListener(listener);
        btAClear.setOnClickListener(listener);
    }
    //ボタンをクリックしたときのリスナクラス
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            //名前入力欄にあるEditTextオブジェクトを取得
            EditText inputN=findViewById(R.id.etName);
            //名前入力欄にあるEditTextオブジェクトを取得
            EditText inputA=findViewById(R.id.etPostadd);

            //メッセージを表示するTextViewオブジェクトを取得
            TextView output=findViewById(R.id.tvOutput);
            //タップされた画面部分のIdのR値を取得
            int id = view.getId();
            //idのR値に応じて処理を分岐
            if(id == R.id.btPrint) {
                //表示ボタンの場合
                //入力された名前の文字列を取得
                String inputStrn = inputN.getText().toString();
                //入力された名前の文字列を取得
                String inputStra = inputA.getText().toString();

                //メッセージを表示
                output.setText(inputStra + "にお住いの" + inputStrn + "さん、こんにちは！");
            }
            else if(id == R.id.btNclear){
                //クリアボタンの場合
                //名前入力欄を空文字に設定
                inputN.setText("");
                //メッセージ表示欄を空文字に設定
                output.setText("");
            }
            else{
                inputA.setText("");
                output.setText("");
            }
        }
    }
}