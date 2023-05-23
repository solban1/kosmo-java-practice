import java.io.*;

class KeyInput 
{
   BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));
   void input(){ 
      System.out.print("점수: ");
      try{
         String line = brKey.readLine();
         line = line.trim();
         if(line.length() == 0){
            input(); //재귀호출
            return;
         }
         int i = Integer.parseInt(line);
         if(i<0 || i>100){
            System.out.println("0~100 범위의 숫자만 가능해요");
            input();
            return;
         }
         System.out.println("#숫자: " + i);
      }catch(IOException ie){
      }catch(NumberFormatException ne){
         System.out.println("숫자의 형태가 아니네요 ㅠㅠ ");
         input();
      }
   }
   public static void main(String[] args) 
   {
      KeyInput k = new KeyInput();
      k.input();
   }
}