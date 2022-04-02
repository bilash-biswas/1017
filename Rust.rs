fn main(){
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num2: i64 = line2.trim().parse().ok().expect("Try");
   
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num3: i64 = line2.trim().parse().ok().expect("Try");

   println!("{0:.3}", (num3 as f64 /12.0) * num2 as f64);
   
}
