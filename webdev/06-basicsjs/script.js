const mathfunctions=["square","cube","root","add","multiply","subtract","divide"];

// const box2=document.querySelector("#box2");

mathfunctions.forEach(e => {
    console.log(e);
});

const usefunction={
    square : function(x){
        return x*x;
    }
}

//Arrow Functions
const square=(p)=>(
    p*p
)
//Arrow Functions
const rand = p => {
    let l=Math.floor(Math.random()*6 );
    console.log(l+" ");
}
//Implicit return && Parameter defining
//This parameter can be changed at the time of execution or the default can be 6(x=6)
const rand1=(x=6)=>(
    Math.floor(Math.random()*x)+1
)

// setTimeout((console.log("Hello")
// ),2000)

// setTimeout( 
//     ()=> console.log(Object.keys(usefunction))
//     ,1000);

/*
let b=0;
let lll=setInterval(()=>{
    if(b>=10){
        clearInterval(lll);
    }
    console.log(square(rand1()));
    b++;
},100);
*/

// The ... Spreads the array
const aalu=[1,23,-9,-55,4,66,-9,78,3];
console.log(aalu);
console.log(...aalu);
console.log(Math.min(aalu),
// Like this
Math.min(...aalu),
Math.max(...aalu),
Math.max(...aalu))

const bg=[0,44,3,45]

const f={bg,aalu}
console.log(f)

const g={...bg,...aalu}
console.log(g);

const fruits=["Mango","Papaya","Guava","Litchi","Pomegranate"];

//Easier way of copying datas to different names and rest of the data to other variable array
const[king,queen,...others]=fruits;

console.log(king,queen,others);

const user={
    name : "nabina rawat",
    class : 'A',
    roll : 10900121001,
    stream : "CSE",
    classroll : 56,
    attendance : square(4)/square(5)
}

console.log(user.attendance)
console.log("Hello user")