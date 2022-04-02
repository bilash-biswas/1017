import 'dart:io';
void main(){
  int num1,num2;
  
  num1 = int.parse(stdin.readLineSync());
  num2 = int.parse(stdin.readLineSync());
  var num = ((num1 / 12) * num2).toStringAsFixed(3);
  print("$num");
}
