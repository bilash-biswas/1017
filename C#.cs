using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int a,b;
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(string.Format("{0:0.000}",(b / 12.0) * a));
            Console.ReadLine();
        }
    }
}
