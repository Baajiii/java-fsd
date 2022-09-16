function student(fname,lname, age){
    this.fname=fname;
    this.lname=lname;
    this.age=age;
}
student.prototype.BornYear=function(){
    console.log("Born Year is" +" "+(2022-this.age ));
}

let s1 = new student("abdul", "Basith", 22);
let s2 = new student("Arul", "Kumaran" , 21);
console.log(s1);
s1.BornYear();
console.log(s2);
s2.BornYear();