package lambdaExpert;

import java.util.Scanner;

//[심화 실습]
//여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOpers를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결

public class MyMath {
	
//	연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
	public static Calc calculator(String oper)
	{
		switch(oper) {
			// 덧셈 리턴
			case"+":
				Calc calcAdd = (num1, num2) -> {
					return num1 + num2;
				};
				return calcAdd;
			// 뺄셈 리턴				
			case "-":
				Calc calcSubtract = (num1, num2) -> {
					return num1 - num2;
				};
				return calcSubtract;
			// 나눗셈 리턴
			case "/":
				Calc calcDevide = (num1, num2) -> {
					return num1 / num2;
				};
				return calcDevide;
			// 곱셈 리턴
			case "*":
				Calc calcMultiple = (num1, num2) -> {
					return num1 * num2;
				};
				return calcMultiple;
		}
		// 그 외 값은 null로 리턴 (정상적인 숫자만 입력된다는 가정 하에)
		return null;
	};
	
	// 식에서 숫자 문자열만 넣는 함수 정의
    public String[] getOperatingNumbers(String inputFormat) {
    	String[] arrNumbers = inputFormat.split("\\+|\\-|\\*|\\/");
    	return arrNumbers;
    }
    
	public static void main(String[] args) {
//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과값을 출력
		MyMath math = new MyMath();
		String message = "값을 입력해주세요. ex)7+5-3", format = "";
	    Scanner sc = new Scanner(System.in);
	    
	    // 최종 결과 값 초기화
	    int finalResult = 0;
	    
	    // 입력받은 숫자의 문자열 배열 초기화
	    String[] strNumbers = null;
	    // 숫자 문자열 배열을 변환할 int 배열 초기화
	    int[] intNumbers = null;
	    // 입력받은 연산기호 문자열 배열 초기화
	    String[] operators = null; 

	    // 새로운 연산을 저장할 배열 인덱스 변수
	    // 곱셈 나눗셈 과 덧셈 뺄셈을 구분하고 
	    // 곱셈 나눗셈이 끝난 후 덧셈 뺄셈의 횟수와 같다.(곱셈 나눗셈을 먼저하며, 덧셈 나눗셈의 갯수를 바인딩 하는 셈)
	    // 곱셈 나눗셈에서는 이 인덱스를 사용하지 않는다.
	    int newNumberIndex = 0; 
	    
	    OperCheck operCheck = (express) -> {
	    	// 입력받은 모든 string을 char 배열로 변경
	    	char[] arrExpress = express.toCharArray();
	    	// 최종 반환할 문자열 초기화
	    	String operator = "";
	    	
	    	// 연산기호만 구분하여 문자열 누적합
	    	for(int i = 0; i < arrExpress.length; i++) {
	    		if(arrExpress[i] == '+' || arrExpress[i] == '-' || arrExpress[i] == '*' || arrExpress[i] == '/')
	    		{
	    			operator += arrExpress[i];
	    		}
	    	}
	    	
	    	// 연산기호는 한 칸 이상 가질 수 없으므로 공백 문자열로 split한 문자열 배열을 반환
	    	return operator.split("");
	    };
	    
	    // 사용자 입력을 받기 위한 메세지 출력
	    System.out.println(message);
	    // 사용자가 입력한 문자열 바인딩
	    format = sc.nextLine();
	    
	    // 사용자가 입력한 문자열에서 연산자를 제외한 숫자 문자열의 배열값
	    strNumbers = math.getOperatingNumbers(format);
	    // 연산자 문자열의 배열값
	    operators = operCheck.getOpers(format);
	    // 위의 숫자 문자열의 배열 수만큼의 int 배열 instance
	    intNumbers = new int[strNumbers.length];
	    
	    // 연산기호 문자열로 split 하였을 때, 숫자 문자열 배열의 첫 번째가 공백 문자열이라면
	    // 처음에 숫자가 아닌 연산기호로 시작하므로, "-1" 또는 "+1" 이다. (정상적인 정수만 입력한다는 가정하에)
	    // 따라서 맨 앞의 연산기호를 부호로하여, 숫자 문자열 배열의 첫 번째의 부호로하여 새 배열로 바꾸어
	    // 연산기호 문자열 배열과 숫자 문자열 배열의 개수를 조정한다.
	    if(strNumbers[0] == "") {
	    	// 배열의 개수를 조정하기 위한 새 문자열 배열 크기 지정
	    	String[] strNewNumbers = new String[strNumbers.length - 1];
	    	String[] newOperators = new String[operators.length - 1];
	    	
	    	// 첫 숫자 문자열 배열값을 부호로하여 합침
	    	strNewNumbers[0] = operators[0] + strNumbers[1];
	    	
	    	// 연산기호 문자열 배열을 한개씩 앞으로 당기며 새 배열 생성
	    	for(int i = 0; i < newOperators.length; i++) {
	    		newOperators[i] = operators[i + 1];
	    	}
	    	// 첫 문자열은 지정하였기 때문에, 두번째 문자열 부터 배열을 한개씩 앞으로 당기며 새 배열 생성
	    	for(int i = 1; i < strNewNumbers.length; i++) {
	    		strNewNumbers[i] = strNumbers[i + 1];
	    	}
	    	
	    	// 새 사이즈의 배열들로 갱신
	    	operators = newOperators;
	    	strNumbers = strNewNumbers;
	    }
	    
	    //숫자 문자열 배열에 있는 각각의 값을 parseInt를 통해 int 배열에 값을 바인딩
	    for(int i = 0; i < strNumbers.length; i++) {
	    	intNumbers[i] = Integer.parseInt(strNumbers[i]);
	    }
	    
	    // 계산할 첫 번째 숫자를 저장
	    // for문이 반복되는 동안, 계산되어질 값
	    int currentNumber = intNumbers[0];
	    

	    // 연산자의 수만큼 for문 반복문을 통해 * 와 / 를 먼저 찾아 연산하기
	    for (int i = 0; i < operators.length; i++) {
	        if (operators[i].equals("*") || operators[i].equals("/")) {
	        	// 곱셈 나눗셈 연산 기호가 나올 때 마다 누적 계산 값을 갱신
	            currentNumber = calculator(operators[i]).calc(currentNumber, intNumbers[i + 1]);
	        } else {
	            // 연산자 덧셈이나 뺄셈이 나오면 (+ 나 -)
	        	// 현재까지 계산된 값을 numbers (곱셈 나눗셈 이후 다음 덧셈 뺄셈이 나온 인덱스 위치의) 배열에 저장
	        	intNumbers[newNumberIndex] = currentNumber;

	        	// for문 반복문 종료 후 최종적으로 나오게 될 연산기호는 
	        	// 모든 곱셈 나눗셈이 종료된 후 이기 때문에
	        	// 덧셈 아니면 뺄셈밖에 없음.
	        	// 따라서 최종적으로 newNuberIndex크기의 length 를 가진 덧셈과 뺄셈의 연산기호 배열이 생성됨. 
	            operators[newNumberIndex] = operators[i];
	            
	            // 각 덧셈 뺄셈이 배열에 덮어씌워지지 않도록 변수를 관리
	            newNumberIndex++;
	            
	            // 추가적으로 for문을 돌리고, 새로운 값 곱셈 나눗셈 연산을 대비하여 다음 인덱스의 값을 미리 바인딩
	            // 다음 숫자를 새롭게 할당
	            currentNumber = intNumbers[i + 1];
	        }
	    }
	    
	    // for문 종료 후
	    // 덧셈 뺄셈 확인 후 for문이 종료될 경우, intNumbers 배열 마지막 위치에 정상적으로 마지막 값이 들어가지만
	    // 곱셈 나눗셈 연산 후 for문이 종료될 경우, intNumbers 배열 마지막 위치에 정상적으로 값이 들어가지 않아 추가함.
	    intNumbers[newNumberIndex] = currentNumber;

	    // 최종 결과는 덧셈 뺄셈 연산이므로, 덧셈 뺄셈 연산을 할 최초 값을 최종 결과 값에 바인딩
	    finalResult = intNumbers[0];
	    
    	// newNumberIndex 로 덧셈 뺄셈을 할 횟수를 미리 확인하여 for문 반복
	    for (int i = 0; i < newNumberIndex; i++) {
	    	// 최초 값 부터 최종 위치의 값까지 계속해서 갱신해가며 연산
	        finalResult = calculator(operators[i]).calc(finalResult, intNumbers[i + 1]);
	    }
	    
	    // 결과 출력
	    System.out.println(finalResult);
	}
}
