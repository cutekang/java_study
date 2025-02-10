package arrayTask;

import java.util.Scanner;


public class ArrayTask2 {

	public static void main(String[] args) {
//		1)사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다
		
//		.charAt()
//		단, 문자열의 메서드는 사용하지 않는다.
//		입력 예) 안녕 hI!!
//		출력 예) 안녕 Hi!!
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String message = "텍스트를 입력해주세요.", inputText = null;
//		char [] inputTextChar = null;
//		
//		int numA = (int)'A', numZ = (int)'Z', gap = (int)'a' - (int)'A';
//		
//		int count = 0;
//		
//		System.out.println(message);
//		
//		inputText = sc.nextLine() + (char)0;
//		while(inputText.charAt(count) != 0) {
//			
//			count++;
//		}
////		System.out.println(count);
//
//		inputTextChar = new char[count];
//		
//		for(int i = 0; i < count; i++) {
//			inputTextChar[i] = inputText.charAt(i);
//			
//			if((int)inputTextChar[i] >= numA
//					&& (int)inputTextChar[i] <= numZ) {
//				int changeLetter =  (int)inputTextChar[i] + gap;
//				inputTextChar[i] = (char)changeLetter;
//			}
//			else if((int)inputTextChar[i] >= numA + gap 
//					&& (int)inputTextChar[i] <= numZ + gap) {
//				
//				int changeLetter =  (int)inputTextChar[i] - gap;
//				inputTextChar[i] = (char)changeLetter;
//			}
//		}
//		
//		for(int i = 0; i < count; i++) {
//			System.out.print(inputTextChar[i]);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		String message = "텍스트를 입력해주세요.", inputText = null;
//		char [] inputTextChar = null;
//		
//		int numA = (int)'A', numZ = (int)'Z', gap = (int)'a' - (int)'A';
//		
//		System.out.println(message);
//		
//		inputText = sc.nextLine() + (char)0;
//		
////		System.out.println(count);
//
//		inputTextChar = new char[inputText.length()];
//		
//		for(int i = 0; i < inputText.length(); i++) {
//			inputTextChar[i] = inputText.charAt(i);
//			
//			if((int)inputTextChar[i] >= numA
//					&& (int)inputTextChar[i] <= numZ) {
//				int changeLetter =  (int)inputTextChar[i] + gap;
//				inputTextChar[i] = (char)changeLetter;
//			}
//			else if((int)inputTextChar[i] >= numA + gap 
//					&& (int)inputTextChar[i] <= numZ + gap) {
//				
//				int changeLetter =  (int)inputTextChar[i] - gap;
//				inputTextChar[i] = (char)changeLetter;
//			}
//		}
//		
//		for(int i = 0; i < inputText.length(); i++) {
//			System.out.print(inputTextChar[i]);
//		}
		
//		2) 정수를 한글로 변경
//		입력 예) 1024
//		출력 예) 일공이사
//				
//		String word = "";
//        String message = "정수를 입력해주세요. ex)1024";
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println(message);
//        word = sc.nextLine();
//        int[] arr = new int[word.length()];
//        
//        for (int i = 0; i < word.length(); i++) {
//           switch(arr[i]) {
//              case '0':
//            	 arr[i] = '공';
//                 break;
//              case '1':
//            	 arr[i] = '일';
//                 break;
//              case '2':
//            	 arr[i] = '이';
//                 break;
//              case '3':
//            	 arr[i] = '삼';
//                 break;
//              case '4':
//            	 arr[i] = '사';
//                 break;
//              case '5':
//            	 arr[i] = '오';
//                 break;
//              case '6':
//            	 arr[i] = '육';
//                 break;
//              case '7':
//            	 arr[i] = '칠';
//                 break;
//              case '8':
//            	 arr[i] = '팔';
//                 break;
//              case '9':
//            	 arr[i] = '구';
//                 break;
//           }        
//        }
//        for (int i = 0; i < word.length(); i++) {
//            switch(arr[i]) {
//               case '공':
//            	  arr[i] = '0';
//                  break;
//               case '일':
//            	  arr[i] = '1';
//                  break;
//               case '이':
//            	  arr[i] = '2';
//                  break;
//               case '삼':
//            	  arr[i] = '3';
//                  break;
//               case '사':
//            	  arr[i] = '4';
//                  break;
//               case '오':
//            	  arr[i] = '5';
//                  break;
//               case '육':
//            	  arr[i] = '6';
//                  break;
//               case '칠':
//            	  arr[i] = '7';
//                  break;
//               case '팔':
//            	  arr[i] = '8';
//                  break;
//               case '구':
//            	  arr[i] = '9';
//                  break;
//            }        
//         }
//        
//        for (int i = 0; i < word.length(); i++) {
//           System.out.print(arr[i]);
//        }
		
		
//		3) 문자열과 찾을 문자를 입력받고
//		문자열에서 문자의 개수를 찾기
//		예시 ) 입력:content cc!
//			  찾을문자 : c
//			  c의 개수 3개
		
		System.out.println("입력: ");
		Scanner sc = new Scanner(System.in);
		
        String word2 = sc.nextLine();
        
        System.out.print("찾을 문자 : " );
        String findWord = sc.next();

        char[] arr2 = new char[word2.length()];
        int cnt =0;
      
        for(int i=0; i< word2.length(); i++)
        {
          arr2[i] = word2.charAt(i);
	      if(arr2[i] == findWord.charAt(0))
	      {
	         cnt++;
	      }
        }
        System.out.println(findWord + "의 개수" + cnt + "개");
    }
}
