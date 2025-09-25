let shohinID = document.getElementById("ID");
let shohinName = document.getElementById("name");
let shohinTanka = document.getElementById("tanka");
let resultFlag = true;

console.log(shohinTanka.value);
let tankaVal = /^\d+(\.\d{1,2})?$/;

//数字のみかをチェックする関数
function onlyNumber(value) {
	return /^[0-9]*$/.test(value);
}
//NULLかどうかチェックする関数
function IsNull(value) {
	return value.length === 0;
}
//IDが4桁を超えるかチェックする関数
function idLength(value) {
	return value.length <= 4;
}
//商品名が100桁を超えるかチェックする関数
function nameLength(value) {
	return value.length <= 100;
}
//
function tankaCheck(value) {
	return tankaVal.test(value);
}
//単価の桁数が全部で10桁を超えるか、あるいは整数部が8桁を超えるかチェックする関数
function tankaLength(value) {
	if (value.includes('.')){
	return value.replace('.', '').length <= 10;
	}else{
	return value.length <= 8;		
	}
}
//単価の小数部が2桁を超えるかチェックする関数
function tankaLength2(value) {
	return value.includes('.') && value.split('.')[1].length > 2
}
//単価の小数部が1未満かチェックする関数
function tankaLength3(value) {
	return value.includes('.') && value.split('.')[1].length < 1
}
//全ての入力項目をチェックする関数
function checkAll() {
	try {
//      結果フラグをtrueにする必要がある		
//		resultFlag = true;  
		
		if (!idLength(shohinID.value)) {
			alert("IDが4桁を超えています！");
			shohinID.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (IsNull(shohinID.value)) {
			alert("IDを入力してください！");
			shohinID.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (!onlyNumber(shohinID.value)) {
			alert("IDは数字で書いてください！");
			shohinID.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (!nameLength(shohinName.value)) {
			alert("商品名が100行を超えています！");
			shohinName.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (IsNull(shohinName.value)) {
			alert("商品名を入力してください！");
			shohinName.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (tankaLength2(shohinTanka.value)) {
			alert("単価の小数点が2桁を超えています！");
			shohinTanka.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (!tankaLength(shohinTanka.value)) {
			alert("単価が8桁を超えています！");
			shohinTanka.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (tankaLength3(shohinTanka.value)) {
			alert("単価を正しく書いてください！");
			shohinTanka.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (IsNull(shohinTanka.value)) {
			alert("単価を入力してください！");
			shohinTanka.focus();
			resultFlag = false;
			return resultFlag;
		}
		if (!tankaCheck(shohinTanka.value)) {
			alert("単価は数字で入力してください！");
			shohinTanka.focus();
			resultFlag = false;
			return resultFlag;
		}

	} catch (error) {
		alert(error);
		return false;
	}
	return resultFlag;

}