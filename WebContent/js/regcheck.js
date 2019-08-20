/**
 *
 */

var idtest = function(){
	idval = $('#id').val();

	// 공백검증
	if(idval.trim().length == 0){
		alert("아이디를 입력하세요.");
		$('#id').focus();
		return false;
	}

	// 길이검증
	if(idval.trim().length < 4 || idval.trim().length > 12){
		alert("4~12 사이 입니다.");
		return false;
	}

	// 정규화검증
	// 영문 소문자로 시작하고 숫자로 조합
	regid = /^[a-z]+[0-9]+[a-zA-Z]{2,10}$/;
	if(!(regid.test(idval))){
		alert("아이디 형식 오류입니다.");
		return false;
	}

	return true;
}

var dongtest = function() {
	//dongvalue = $('#dong').val();
	if(dongvalue.trim().length == 0){
		alert("동이름을 입력하세요.");
		$('#dong').focus();
		return false;
	}

	return true;
}

var regtest = function() {

	// 이름, 비밀번호, 이메일, 전화번호
	// 이름
	nameval = $('#name').val();
	if(nameval.trim().length == 0){
		alert("이름을 입력하세요.");
		$('#name').focus();
		return false;
	}

	regname = /^[가-힣]+|^[a-zA-Z]+/;
	if(regname.test(nameval)){
		rkor = /^[가-힣]+$/;
		reng = /^[a-zA-Z]+$/;

		// 한글일 경우
		if(rkor.test(nameval)){
			// 길이검증 2-5
			if(nameval.trim().length < 2 || nameval.trim().length > 5){
				alert("2~5 사이 입니다.");
				$('#name').focus();
				return false;
			}
		} else if(reng.test(nameval)) {
			// 영문일 경우 5-10
			if(nameval.trim().length < 5 || nameval.trim().length > 10){
				alert("5~10 사이 입니다.");
				$('#name').focus();
				return false;
			}
		}else {
			// 숫자로만 입력했을 떄
			alert("이름형식오류");
			$('#name').focus();
			return false;
		}
	}

	//========================================================
	// 비밀번호
	// 공백검증
	pwdval = $('#pwd').val();
	if(pwdval.trim().length == 0){
		alert("비밀번호를을 입력하세요.");
		$('#pwd').focus();
		return false;
	}

	// 길이검증 4-15
	if(pwdval.trim().length < 4 || pwdval.trim().length > 15){
		alert("4~15 사이 입니다.");
		$('#pwd').focus();
		return false;
	}

	// 정규식  - 전방탐색을 이용 - 숫자, 영문대소문자, 특수문자가 반드시 1개이상씩 포함
	// 0번이상 나오는 문다 뒤에 a-z를 기준으로 전방에 아무것도 없다. 그래서 a-z로 시작
	// 0번이상 나오는 문다 뒤에 A-Z를 기준으로 전방에 아무것도 없다. 그래서 A-Z로 시작
	// 0번이상 나오는 문다 뒤에 0-9를 기준으로 전방에 아무것도 없다. 그래서 0-9로 시작
	   regpass = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[0-9])(?=.*[!@#$%^&*()+_-]).{8,12}$/;
	   if(!(regpass.test(passval))){
	      alert("비밀번호 형식오류입니다.");
	  $('#pwd').focus();
	      return false;
	   }

	/*   // 정규식
	   aa = "http://www.naver.com";
	   //aa = "https://www.naver.com";

	   reg = /\w(?=:)/;   // ?= 전방탐색 ?=찾는문자

	   bb = aa.match(reg);
	   if(bb == "http") {
	      alert("http처리입니다.");
	   } else if(bb == "https"){
	      alert("https접속입니다.");
	   }
	*/

	   return true;
}