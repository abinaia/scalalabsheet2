@main def main(): Unit = {
  var a=2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f

  //FOR QUE a
  b=b-1 //for --b
  val one= b*a+c*d
  d=d-1 //for d--
  println(s"(- -b * a + c *d - -) =$one") 

  //FOR QUE b
  println(s"a= $a")
  a+=1

  //for que c
  var g = 1
  val exp1= -2*(g-k)+c
  println(s"Value of -2*(g-k)+c= $exp1") 

  //for que d
  println(s"c=$c")
  c+=1

  //for que e
  c+=1
  val expr=c*a
  println(s"c=$expr")
  a+=1
}
