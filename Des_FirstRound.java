import javax.swing.*;
public class Des_FirstRound
{
private static final byte[][] S = { {
		14, 4,  13, 1,  2,  15, 11, 8,  3,  10, 6,  12, 5,  9,  0,  7,
		0,  15, 7,  4,  14, 2,  13, 1,  10, 6,  12, 11, 9,  5,  3,  8,
		4,  1,  14, 8,  13, 6,  2,  11, 15, 12, 9,  7,  3,  10, 5,  0,
		15, 12, 8,  2,  4,  9,  1,  7,  5,  11, 3,  14, 10, 0,  6,  13
	}, {
		15, 1,  8,  14, 6,  11, 3,  4,  9,  7,  2,  13, 12, 0,  5,  10,
		3,  13, 4,  7,  15, 2,  8,  14, 12, 0,  1,  10, 6,  9,  11, 5,
		0,  14, 7,  11, 10, 4,  13, 1,  5,  8,  12, 6,  9,  3,  2,  15,
		13, 8,  10, 1,  3,  15, 4,  2,  11, 6,  7,  12, 0,  5,  14, 9
	}, {
		10, 0,  9,  14, 6,  3,  15, 5,  1,  13, 12, 7,  11, 4,  2,  8,
		13, 7,  0,  9,  3,  4,  6,  10, 2,  8,  5,  14, 12, 11, 15, 1,
		13, 6,  4,  9,  8,  15, 3,  0,  11, 1,  2,  12, 5,  10, 14, 7,
		1,  10, 13, 0,  6,  9,  8,  7,  4,  15, 14, 3,  11, 5,  2,  12
	}, {
		7,  13, 14, 3,  0,  6,  9,  10, 1,  2,  8,  5,  11, 12, 4,  15,
		13, 8,  11, 5,  6,  15, 0,  3,  4,  7,  2,  12, 1,  10, 14, 9,
		10, 6,  9,  0,  12, 11, 7,  13, 15, 1,  3,  14, 5,  2,  8,  4,
		3,  15, 0,  6,  10, 1,  13, 8,  9,  4,  5,  11, 12, 7,  2,  14
	}, {
		2,  12, 4,  1,  7,  10, 11, 6,  8,  5,  3,  15, 13, 0,  14, 9,
		14, 11, 2,  12, 4,  7,  13, 1,  5,  0,  15, 10, 3,  9,  8,  6,
		4,  2,  1,  11, 10, 13, 7,  8,  15, 9,  12, 5,  6,  3,  0,  14,
		11, 8,  12, 7,  1,  14, 2,  13, 6,  15, 0,  9,  10, 4,  5,  3
	}, {
		12, 1,  10, 15, 9,  2,  6,  8,  0,  13, 3,  4,  14, 7,  5,  11,
		10, 15, 4,  2,  7,  12, 9,  5,  6,  1,  13, 14, 0,  11, 3,  8,
		9,  14, 15, 5,  2,  8,  12, 3,  7,  0,  4,  10, 1,  13, 11, 6,
		4,  3,  2,  12, 9,  5,  15, 10, 11, 14, 1,  7,  6,  0,  8,  13
	}, {
		4,  11, 2,  14, 15, 0,  8,  13, 3,  12, 9,  7,  5,  10, 6,  1,
		13, 0,  11, 7,  4,  9,  1,  10, 14, 3,  5,  12, 2,  15, 8,  6,
		1,  4,  11, 13, 12, 3,  7,  14, 10, 15, 6,  8,  0,  5,  9,  2,
		6,  11, 13, 8,  1,  4,  10, 7,  9,  5,  0,  15, 14, 2,  3,  12
	}, {
		13, 2,  8,  4,  6,  15, 11, 1,  10, 9,  3,  14, 5,  0,  12, 7,
		1,  15, 13, 8,  10, 3,  7,  4,  12, 5,  6,  11, 0,  14, 9,  2,
		7,  11, 4,  1,  9,  12, 14, 2,  0,  6,  10, 13, 15, 3,  5,  8,
		2,  1,  14, 7,  4,  10, 8,  13, 15, 12, 9,  0,  3,  5,  6,  11
	} };


public static String toBinary(String str, int bits) {
    String result = "";
    String tmpStr;
    int tmpInt;
    char[] messChar = str.toCharArray();

    for (int i = 0; i < messChar.length; i++) {
        tmpStr = Integer.toBinaryString(messChar[i]);
        tmpInt = tmpStr.length();
        if(tmpInt != bits) {
            tmpInt = bits - tmpInt;
            if (tmpInt == bits) {
                result += tmpStr;
            } else if (tmpInt > 0) {
                for (int j = 0; j < tmpInt; j++) {
                    result += "0";
                }
                result += tmpStr;
            } else {
                System.err.println("argument 'bits' is too small");
            }
        } else {
            result += tmpStr;
        }
        result += ""; // separator
    }

    return result;
}


public static String BitPermutation(String M)
{
char[] chars=M.toCharArray();
char[] chars1 = new char[64];
chars1[0]=chars[57];chars1[1]=chars[49];chars1[2]=chars[41];chars1[3]=chars[33];chars1[4]=chars[25];chars1[5]=chars[17];chars1[6]=chars[9];chars1[7]=chars[1];
chars1[8]=chars[59];chars1[9]=chars[51];chars1[10]=chars[43];chars1[11]=chars[35];chars1[12]=chars[27];chars1[13]=chars[19];chars1[14]=chars[11];chars1[15]=chars[3];
chars1[16]=chars[61];chars1[17]=chars[53];chars1[18]=chars[45];chars1[19]=chars[37];chars1[20]=chars[29];chars1[21]=chars[21];chars1[22]=chars[13];chars1[23]=chars[5];
chars1[24]=chars[63];chars1[25]=chars[55];chars1[26]=chars[47];chars1[27]=chars[39];chars1[28]=chars[31];chars1[29]=chars[23];chars1[30]=chars[15];chars1[31]=chars[7];
chars1[32]=chars[56];chars1[33]=chars[48];chars1[34]=chars[40];chars1[35]=chars[32];chars1[36]=chars[24];chars1[37]=chars[16];chars1[38]=chars[8];chars1[39]=chars[0];
chars1[40]=chars[58];chars1[41]=chars[50];chars1[42]=chars[42];chars1[43]=chars[34];chars1[44]=chars[26];chars1[45]=chars[18];chars1[46]=chars[10];chars1[47]=chars[2];
chars1[48]=chars[60];chars1[49]=chars[52];chars1[50]=chars[44];chars1[51]=chars[36];chars1[52]=chars[28];chars1[53]=chars[20];chars1[54]=chars[12];chars1[55]=chars[4];
chars1[56]=chars[62];chars1[57]=chars[54];chars1[58]=chars[46];chars1[59]=chars[38];chars1[60]=chars[30];chars1[61]=chars[22];chars1[62]=chars[14];chars1[63]=chars[6];
String str = String.valueOf(chars1);
return str;
}

public static String LPT(String M)
{
 String str=M.substring(0,32);
return str;
}


public static String RPT(String M)
{
 String str=M.substring(32,64);
return str;
}



public static String PC_1(String m)
{
char[] chars=m.toCharArray();
char[] chars1 = new char[56];
chars1[0]=chars[56];chars1[1]=chars[48];chars1[2]=chars[40];chars1[3]=chars[32];chars1[4]=chars[24];chars1[5]=chars[16];chars1[6]=chars[8];
chars1[7]=chars[0];chars1[8]=chars[57];chars1[9]=chars[49];chars1[10]=chars[41];chars1[11]=chars[33];chars1[12]=chars[25];chars1[13]=chars[17];
chars1[14]=chars[9];chars1[15]=chars[1];chars1[16]=chars[58];chars1[17]=chars[50];chars1[18]=chars[42];chars1[19]=chars[34];chars1[20]=chars[26];
chars1[21]=chars[18];chars1[22]=chars[10];chars1[23]=chars[2];chars1[24]=chars[59];chars1[25]=chars[51];chars1[26]=chars[43];chars1[27]=chars[35];
chars1[28]=chars[62];chars1[29]=chars[54];chars1[30]=chars[46];chars1[31]=chars[38];chars1[32]=chars[30];chars1[33]=chars[22];chars1[34]=chars[14];
chars1[35]=chars[6];chars1[36]=chars[24];chars1[37]=chars[53];chars1[38]=chars[45];chars1[39]=chars[37];chars1[40]=chars[29];chars1[41]=chars[21];
chars1[42]=chars[13];chars1[43]=chars[5];chars1[44]=chars[60];chars1[45]=chars[52];chars1[46]=chars[44];chars1[47]=chars[36];chars1[48]=chars[28];
chars1[49]=chars[20];chars1[50]=chars[12];chars1[51]=chars[4];chars1[52]=chars[27];chars1[53]=chars[19];chars1[54]=chars[11];chars1[55]=chars[3];

String str = String.valueOf(chars1);

return str;


}



public static String C_0(String M)
{
 String str=M.substring(0,28);
return str;
}


public static String D_0(String M)
{
String str=M.substring(28,56);
return str;
}


 public static String zhvendosC(String m)
   {char[] vr=m.toCharArray();
     
      for (int i=0; i<vr.length-1; i++)
         {vr[i]=vr[i+1];}
      vr[vr.length-1]=vr[0];
      String str = String.valueOf(vr);

return str;
   }
   public static String zhvendosD(String a, char b)
   { char[] vr=a.toCharArray();
   
     // boolean [] vr=new boolean[a.length];
      for (int i=0; i<vr.length-1; i++)
         {vr[i]=vr[i+1];}
      vr[vr.length-1]=b;
        String str = String.valueOf(vr);

return str;
   }
 public static String zhvendosD(String m)
   {char[] vr=m.toCharArray();
     int j=vr.length-1;
     System.out.println(vr[1]);
      vr[vr.length-1]=vr[0];
      for (int i=0; i<vr.length-1; i++)
         {vr[i]=vr[i+1];}
      
      String str = String.valueOf(vr);

return str;
   }









public static String Qelesi_K1(String a,String b )
{String m=a+b;
char[] chars=m.toCharArray();
char[] chars1 = new char[48];
chars1[0]=chars[13];chars1[1]=chars[16];chars1[2]=chars[10];chars1[3]=chars[23];chars1[4]=chars[0];chars1[5]=chars[4];
chars1[6]=chars[2];chars1[7]=chars[27];chars1[8]=chars[14];chars1[9]=chars[5];chars1[10]=chars[20];chars1[11]=chars[9];
chars1[12]=chars[22];chars1[13]=chars[18];chars1[14]=chars[11];chars1[15]=chars[3];chars1[16]=chars[25];chars1[17]=chars[7];
chars1[18]=chars[15];chars1[19]=chars[6
];chars1[20]=chars[26];chars1[21]=chars[19];chars1[22]=chars[12];chars1[23]=chars[1];
chars1[24]=chars[40];chars1[25]=chars[51];chars1[26]=chars[30];chars1[27]=chars[36];chars1[28]=chars[46];chars1[29]=chars[54];
chars1[30]=chars[29];chars1[31]=chars[39];chars1[32]=chars[50];chars1[33]=chars[44];chars1[34]=chars[32];chars1[35]=chars[47];
chars1[36]=chars[43];chars1[37]=chars[48];chars1[38]=chars[38];chars1[39]=chars[55];chars1[40]=chars[33];chars1[41]=chars[52];
chars1[42]=chars[45];chars1[43]=chars[41];chars1[44]=chars[49];chars1[45]=chars[35];chars1[46]=chars[28];chars1[47]=chars[31];
String str = String.valueOf(chars1);

return str;

}
public static String E_R0(String m)
{  char[] chars=m.toCharArray();
char[] chars1 = new char[48];
chars1[0]=chars[31];chars1[1]=chars[0];chars1[2]=chars[1];chars1[3]=chars[2];chars1[4]=chars[3];chars1[5]=chars[4];
chars1[6]=chars[3];chars1[7]=chars[4];chars1[8]=chars[5];chars1[9]=chars[6];chars1[10]=chars[7];chars1[11]=chars[8];
chars1[12]=chars[7];chars1[13]=chars[8];chars1[14]=chars[9];chars1[15]=chars[10];chars1[16]=chars[11];chars1[17]=chars[12];
chars1[18]=chars[11];chars1[19]=chars[12];chars1[20]=chars[13];chars1[21]=chars[14];chars1[22]=chars[15];chars1[23]=chars[16];
chars1[24]=chars[15];chars1[25]=chars[16];chars1[26]=chars[17];chars1[27]=chars[18];chars1[28]=chars[19];chars1[29]=chars[20];
chars1[30]=chars[19];chars1[31]=chars[20];chars1[32]=chars[21];chars1[33]=chars[22];chars1[34]=chars[23];chars1[35]=chars[24];
chars1[36]=chars[23];chars1[37]=chars[24];chars1[38]=chars[25];chars1[39]=chars[26];chars1[40]=chars[27];chars1[41]=chars[28];
chars1[42]=chars[27];chars1[43]=chars[28];chars1[44]=chars[29];chars1[45]=chars[30];chars1[46]=chars[31];chars1[47]=chars[0];
String str = String.valueOf(chars1);

return str;

}

public static String S_1(String a, String b)
{char[] chars=a.toCharArray();
char[] chars1=b.toCharArray();
char[] j=new char[chars.length];
char[] k=new char[chars1.length];
char[] ans=new char[chars1.length];
for(int i=0; i<chars.length; i++)
{j[i]=chars[i];
k[i]=chars1[i];
}
boolean [] vr=new boolean[48];
 boolean [] vr1=new boolean[48];
 boolean [] rez=new boolean[48];
for(int i=0; i<chars.length; i++)
{
if(j[i]=='1')
vr[i]=true;
if(k[i]=='1')
vr1[i]=true;
}
for(int i=0; i<chars.length; i++)
{rez[i]=vr[i]^vr1[i];}

for(int i=0; i<chars.length; i++)
{if(rez[i]==true)
ans[i]='1';
if(rez[i]==false)
ans[i]='0';}

String str = String.valueOf(ans);

return str;
}


private static String Sbox(String b) {
String s1="";
int bits[]=new int[48];
for(int i=0; i<b.length(); i++)
{   
if (b.charAt(i)=='1') bits[i]=1;
else bits[i]=0;
}
		// S-boxes are applied in this method.
		int output[] = new int[32];
		// We know that input will be of 32 bits, hence we will loop 32/4 = 8
		// times (divided by 4 as we will take 4 bits of input at each
		// iteration).
		for(int i=0 ; i < 8 ; i++) {
			// S-box requires a row and a column, which is found from the
			// input bits. The first and 6th bit of the current iteration
			// (i.e. bits 0 and 5) gives the row bits.
			int row[] = new int [2];
			row[0] = bits[6*i];
			row[1] = bits[(6*i)+5];
			String sRow = row[0] + "" + row[1];
			// Similarly column bits are found, which are the 4 bits between
			// the two row bits (i.e. bits 1,2,3,4)
			int column[] = new int[4];
			column[0] = bits[(6*i)+1];
			column[1] = bits[(6*i)+2];
			column[2] = bits[(6*i)+3];
			column[3] = bits[(6*i)+4];
			String sColumn = column[0] +""+ column[1] +""+ column[2] +""+ column[3];
			int iRow = Integer.parseInt(sRow, 2);
 
			int iColumn = Integer.parseInt(sColumn, 2);
         
			int x = S[i][(iRow*16) + iColumn];
         
			 String s = Integer.toBinaryString(x);
			while(s.length() < 4) {
				s = "0" + s;
			}
         s1=s1+s;}
         
          return s1;}


public static String Pbox(String m)
{
char[] chars=m.toCharArray();
char[] chars1 = new char[32];
chars1[0]=chars[15];chars1[1]=chars[6];chars1[2]=chars[19];chars1[3]=chars[20];chars1[4]=chars[28];chars1[5]=chars[11];
chars1[6]=chars[27];chars1[7]=chars[16];chars1[8]=chars[0];chars1[9]=chars[14];chars1[10]=chars[22];chars1[11]=chars[25];
chars1[12]=chars[4];chars1[13]=chars[17];chars1[14]=chars[30];chars1[15]=chars[9];chars1[16]=chars[1];chars1[17]=chars[7];
chars1[18]=chars[23];chars1[19]=chars[13];chars1[20]=chars[31];chars1[21]=chars[26];chars1[22]=chars[2];chars1[23]=chars[8];
chars1[24]=chars[18];chars1[25]=chars[12];chars1[26]=chars[29];chars1[27]=chars[5];chars1[28]=chars[21];chars1[29]=chars[10];
chars1[30]=chars[3];chars1[31]=chars[24];
String str = String.valueOf(chars1);

return str;
}

public static String R_1(String a, String b)
{char[] chars=a.toCharArray();
char[] chars1=b.toCharArray();
char[] j=new char[chars.length];
char[] k=new char[chars1.length];
char[] ans=new char[chars1.length];
for(int i=0; i<chars.length; i++)
{j[i]=chars[i];
k[i]=chars1[i];
}
boolean [] vr=new boolean[48];
 boolean [] vr1=new boolean[48];
 boolean [] rez=new boolean[48];
for(int i=0; i<chars.length; i++)
{
if(j[i]=='1')
vr[i]=true;
if(k[i]=='1')
vr1[i]=true;
}
for(int i=0; i<chars.length; i++)
{rez[i]=vr[i]^vr1[i];}

for(int i=0; i<chars.length; i++)
{if(rez[i]==true)
ans[i]='1';
if(rez[i]==false)
ans[i]='0';}

String str = String.valueOf(ans);

return str;
}


public static void ToHex(String a,String b)
 {int digitNumber = 1;
    int sum = 0;
    String binary=a+b;
    for(int i = 0; i < binary.length(); i++){
        if(digitNumber == 1)
            sum+=Integer.parseInt(binary.charAt(i) + "")*8;
        else if(digitNumber == 2)
            sum+=Integer.parseInt(binary.charAt(i) + "")*4;
        else if(digitNumber == 3)
            sum+=Integer.parseInt(binary.charAt(i) + "")*2;
        else if(digitNumber == 4 || i < binary.length()+1){
            sum+=Integer.parseInt(binary.charAt(i) + "")*1;
            digitNumber = 0;
            if(sum < 10)
                System.out.print(sum);
            else if(sum == 10)
                System.out.print("A");
            else if(sum == 11)
                System.out.print("B");
            else if(sum == 12)
                System.out.print("C");
            else if(sum == 13)
                System.out.print("D");
            else if(sum == 14)
                System.out.print("E");
            else if(sum == 15)
                System.out.print("F");
            sum=0;
        }
        digitNumber++;  
    }}

public static void main(String[] args)
{String msg="LORETAAA";
System.out.println("Mesazhi i pa enkriptuar  "+msg);
System.out.println("Mesazhi binare    "+toBinary(msg,8));
//String i="0001001100110100010101110111100110011011101111001101111111110001";
//System.out.println("Mesazhi binare    "+i);

String ip =BitPermutation(toBinary(msg,8));
//String ip =BitPermutation(i);
System.out.println("Bit permutationIP "+ip);
String L_o=LPT(ip);
String R_o=RPT(ip);
String PC=PC_1(toBinary(msg,8));
//String PC=PC_1(ip);
System.out.println("Left Plain Text   "+L_o);
System.out.println("Right Plain Text  "+R_o); 
System.out.println("Pc-1 permutation  "+PC);
String D_0=D_0(PC);
String C_0=C_0(PC);
System.out.println("C_0 blloku  "+C_0);
System.out.println("D_0 blloku  "+D_0);
char a=C_0.charAt(0);
String C_1=zhvendosD(C_0,a);
System.out.println("C_1 blloku  "+C_1);
char c = D_0.charAt(0);
String D_1=zhvendosD(D_0,c);
System.out.println("D_1 blloku  "+D_1);
String K_1=Qelesi_K1(C_1,D_1);
System.out.println("Qelesi K_1     "+K_1);
String E_R=E_R0(R_o);
System.out.println("Blloku E(R_0)  "+E_R);
String s= S_1(K_1,E_R);
System.out.println("Blloku S_1     "+s);
String S_b=Sbox(s);
System.out.println("S-boxes:       "+S_b);
String p=Pbox(S_b);
//String p="01000100110110101111100010011110";
System.out.println("P-box  :       "+p);
String R_1=R_1(p,L_o);
System.out.println("R_1    :       "+R_1);
String L_1=R_o;
System.out.println("Teksti ne hex: ");
ToHex(L_1,R_1);

}}