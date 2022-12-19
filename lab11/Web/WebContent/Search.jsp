<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>
<style type="text/css">
.button{
	position:absolute;
	width:45px;
	height:25px;
	font-size:15px;
	left:50%;
	top:50%;
}
.border-style {
	border-radius:75px/90px;
}
#padding{
	padding: 0px 0px 0px 15px;
}
.note{
	position:absolute;
	width:50px;
	height:50px;
	animation-timing-function: ease-in-out;
	animation-direction: alternate;
	animation-name:note;
	animation-duration:5s;
	animation-iteration-count:infinite;
	
}
@keyframes note{
	0%{
		
		left:640px;		
		top:0px;
		
	}
	25%{
		left:700px;
		top:60px;
		
	}
	50%{
		left:760px;
		top:0px;
	}
	75%{
		left:700px;
		top:-60px;
	}
	100%{
		left:640px;
		top:0px;
	}
}
.note1{
	position:absolute;
	width:50px;
	height:50px;
	animation-direction: alternate;
	animation-timing-function: ease-in-out;
	animation-name:note1;
	animation-duration:5s;
	animation-iteration-count:infinite;
}
@keyframes note1{
	0%{
		left:760px;		
		top:0px;
		
	}
	25%{
		left:700px;
		top:-60px;
	}
	50%{
		left:640px;
		top:0px;
	}
	75%{
		left:700px;
		top:60px;
	}
	100%{
		left:760px;
		top:0px;
		
	}
}
.note2{
	position:absolute;
	width:50px;
	height:50px;
	animation-direction: alternate;
	animation-timing-function: ease-in-out;
	animation-name:note2;
	animation-duration:5s;
	animation-iteration-count:infinite;
}
@keyframes note2{
	0%{
		left:700px;		
		top:-60px;		
	}
	25%{
		left:640px;
		top:0px;
	}
	50%{
		left:700px;
		top:60px;
	}
	75%{
		left:760px;
		top:0px;
	}
	100%{
		left:700px;
		top:-60px;
		
	}
}
.note3{
	position:absolute;
	width:50px;
	height:50px;
	animation-direction: alternate;
	animation-timing-function: ease-in-out;
	animation-name:note3;
	animation-duration:5s;
	animation-iteration-count:infinite;
}
@keyframes note3{
	0%{
		left:700px;		
		top:60px;		
	}
	25%{
		left:760px;
		top:0px;
	}
	50%{
		left:700px;
		top:-60px;
	}
	75%{
		left:640px;
		top:0px;
	}
	100%{
		left:700px;
		top:60px;
		
	}
}
.box{
  position:relative;
}
.box:before{
  content:'';
  position:absolute;
  z-index:2;
  top:60px;
  left:50px;
  width:50px;
  height:50px;
  
  border-radius:2px;
  transform: rotate(45deg);
  -webkit-animation:box 1.25s infinite ; 
}
@-webkit-keyframes box{
  0%{
    top:50px;
  }
  20%{
    border-radius:2px;  
  }
  50%{
    top:80px; 
    border-bottom-right-radius:25px;
  }
  80%{
    border-radius:2px; 
  }
  100%{
    top:50px;
  }
}
.box:after{
  content:'';
  position:absolute;
  z-index:1;
  top:128px;
  left:52px;
  width:44px;
  height:3px;
  background:#eaeaea;
  border-radius:100%;
  -webkit-animation:shadow 1.25s infinite ; 
}
@-webkit-keyframes shadow{
  0%,100%{
    left:54px;
    width:40px;
    background:#eaeaea;
  }
  50%{
    top:126px;
    left:50px;   
    width:50px;
    height:7px;
    background:#eee;
  }
}
</style>
<script type="text/javascript">
function click10() {
	document.getElementsByName("searchNum")[0].value = 10;
	document.getElementsByName("searchNum")[0].style.color = '#0489B1';
}
function click20() {
	document.getElementsByName("searchNum")[0].value = 20;
	document.getElementsByName("searchNum")[0].style.color = '#0489B1';
}
function click40() {
	document.getElementsByName("searchNum")[0].value = 40;
	document.getElementsByName("searchNum")[0].style.color = '#0489B1';
}
function click80() {
	document.getElementsByName("searchNum")[0].value = 80;
	document.getElementsByName("searchNum")[0].style.color = '#0489B1';
}
</script>
</head>
<body style='background-color:#0489B1'>
<form action='${requestUri}' method='get'>

<div class = 'box'style = 'position:absolute;margin-top:530px;margin-left:635px;'></div>
<div class='note'>
<img src="images/musical-note.png" style = 'position:absolute;width:40px;height:40px;margin-top:520px' >
</div> 
<div class='note1'>
<img src="images/musical-note.png" style = 'position:absolute;width:40px;height:40px;margin-top:520px' >
</div> 
<div class='note2'>
<img src="images/musical-note-2.png" style = 'position:absolute;width:40px;height:40px;margin-top:520px' >
</div>
<div class='note3'>
<img src="images/musical-note-2.png" style = 'position:absolute;width:40px;height:40px;margin-top:520px' >
</div>  
<div>
<input type='text' class="border-style" id="padding"  
style='font-size:120%;position:absolute;left:50%;top:48%;
margin-top:-47px;margin-left:-400px;width:800px;height:45px' name='keyword' placeholder='請輸入關鍵字'
onfocus="placeholder= '' " onblur="placeholder='請輸入關鍵字'" />
</div>
<div>
<button type='button' class='button' name='button20' onclick='click10()' style='border-radius:10px;cursor:pointer;margin-left:-100px'>10</button>
</div>
<div>
<button type='button' class='button' name='button40' onclick='click20()' style='border-radius:10px;cursor:pointer;margin-left:-47.5px'>20</button>
</div>
<div>
<button type='button' class='button' name='button60' onclick='click40()' style='border-radius:10px;cursor:pointer;margin-left:2.5px'>40</button>
</div>
<div>
<button type='button' class='button' name='button80' onclick='click80()' style='border-radius:10px;cursor:pointer;margin-left:52.5px'>80</button>
</div>
<div>
<input type='text' name='searchNum' value='10' style='color:#0489B1;border-style:none;background-color:#0489B1'>
</div>
<div>
<input type='image' src="images/loupe-2.png" 
style='position:absolute;width:37px;height:37px;left:50%;top:50%;margin-top:-55px;
margin-left:368px '/>
</div>
<div>
<a href ='http://localhost:8080/Final_Project/TestProject'><img src="images/band-2.png" style='position:absolute;width:350px;height:150px;left:50%;top:50%;margin-top:-265px;
margin-left:-175px '></a>
</div>
</form>
</body>
</html>