/*
 * Developer : CreatorB
 * FreeSite : www.creatorbportfolio.wordpress.com
 * Tutorial : www.creatorbnotes.blogspot.com
 */

package id.creatorb.calculator1;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
/** Called when the activity is first created. */
Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,
nol,tambah,kali,kurang,bagi,samadengan,akar,clear,koma;
EditText input;
int operator;
double nilai1 , nilai2;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

input = (EditText)findViewById(R.id.input1);
satu = (Button)findViewById(R.id.satu);
dua = (Button)findViewById(R.id.dua);
tiga = (Button)findViewById(R.id.tiga);
empat = (Button)findViewById(R.id.empat);
lima = (Button)findViewById(R.id.lima);
enam = (Button)findViewById(R.id.enam);
tujuh = (Button)findViewById(R.id.tujuh);
delapan = (Button)findViewById(R.id.delapan);
sembilan = (Button)findViewById(R.id.sembilan);
nol = (Button)findViewById(R.id.nol);
tambah = (Button)findViewById(R.id.tambah);
kali = (Button)findViewById(R.id.kali);
kurang = (Button)findViewById(R.id.kurang);
bagi = (Button)findViewById(R.id.bagi);
samadengan = (Button)findViewById(R.id.samadengan);
koma = (Button)findViewById(R.id.koma);
clear = (Button)findViewById(R.id.clear);

satu.setOnClickListener(this);
dua.setOnClickListener(this);
tiga.setOnClickListener(this);
empat.setOnClickListener(this);
lima.setOnClickListener(this);
enam.setOnClickListener(this);
tujuh.setOnClickListener(this);
delapan.setOnClickListener(this);
sembilan.setOnClickListener(this);
nol.setOnClickListener(this);
tambah.setOnClickListener(this);
kali.setOnClickListener(this);
kurang.setOnClickListener(this);
bagi.setOnClickListener(this);
samadengan.setOnClickListener(this);
koma.setOnClickListener(this);
clear.setOnClickListener(this);

}

public void onClick(View v) {
switch (v.getId()) {
case R.id.satu:
handleNomor("1");
break;
case R.id.dua:
handleNomor("2");
break;
case R.id.tiga:
handleNomor("3");
break;
case R.id.empat:
handleNomor("4");
break;
case R.id.lima:
handleNomor("5");
break;
case R.id.enam:
handleNomor("6");
break;
case R.id.tujuh:
handleNomor("7");
break;
case R.id.delapan:
handleNomor("8");
break;
case R.id.sembilan:
handleNomor("9");
break;
case R.id.nol:
handleNomor("0");
break;
case R.id.koma:
handleNomor(".");
break;
case R.id.tambah:
nilai1=Double.parseDouble(input.getText().toString());
input.setText("");
operator=1;
break;
case R.id.kurang:
nilai1=Double.parseDouble(input.getText().toString());
input.setText("");
operator=2;
break;
case R.id.kali:
nilai1=Double.parseDouble(input.getText().toString());
input.setText("");
operator=3;
break;
case R.id.bagi:
nilai1=Double.parseDouble(input.getText().toString());
input.setText("");
operator=4;
break;
case R.id.samadengan:
nilai2=Double.parseDouble(input.getText().toString());
input.setText("");
if(operator==1){
input.setText(Double.toString(nilai1+nilai2));
}else if(operator==2){
input.setText(Double.toString(nilai1-nilai2));
}else if(operator==3){
input.setText(Double.toString(nilai1*nilai2));
}else if(operator==4){
input.setText(Double.toString(nilai1/nilai2));
}
break;
case R.id.clear:
clear();
break;
default:
break;
}


}
private void handleNomor(String nomor) {
// TODO Auto-generated method stub

String txt = input.getText().toString();
txt+=nomor;
input.setText(txt);

}
private void clear(){
input.setText("");
}}