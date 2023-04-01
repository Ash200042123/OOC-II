namespace Lab1
{
    public class Program
    {
        static void Main(String[] args)
        {
            Average avg = new Average();
            Console.WriteLine(avg.calcAverage(5,10,9,"7"));

        }
    }

    public class Average
    {
        //public double calcAverage(int y,params object[] n)
        //{
        //    double sum=0;
        //    sum += y;
        //    for(int i = 0; i < n.Length; i++)
        //    {
        //        double x = Convert.ToDouble(n[i]);
        //        sum += x;
        //    }
        //    return sum/(n.Length+1);
        //}

        public double calcAverage(params object[] n)
        {
            double sum = 0;
            for (int i = 0; i < n.Length; i++)
            {
                double x = Convert.ToDouble(n[i]);
                sum += x;
            }
            return sum / n.Length;
        }
    }
}