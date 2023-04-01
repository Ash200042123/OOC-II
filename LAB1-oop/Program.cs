
namespace Lab1
{
    public class Program
    {
        static void Main(String[] args)
        {

            AirBooking bus = new AirBooking();
           // bus.ticketBooking();

            Agent agent = new Agent();
            agent.bookTicket("Book Bus");
        }
        public abstract class Booking
        {
            public abstract void ticketBooking();
        }
    }
        

        internal class AirBooking : Booking
        {
            public override void ticketBooking()
            {
                Console.WriteLine("Air ticket booked");
            }
        }

        internal class BusBooking : Booking
        {
            public override void ticketBooking()
            {
                Console.WriteLine("Bus ticket booked");
            }
        }

        internal class Agent
        {

        public void bookTicket(string x)
        {

            if (x == "book bus" || x=="Book Bus" || x=="Book bus")
            {
                BusBooking bus1 = new BusBooking();
                bus1.ticketBooking();
            }
            else if (x == "book plane" || x=="Book Plane" || x=="Book plane")
            {
                AirBooking air1 = new AirBooking();
                air1.ticketBooking();

            }
        }

        public void bookticket(string x, string y)
        {
            if (x == "book bus" || x == "Book Bus" || x == "Book bus")
            {
                BusBooking bus1 = new BusBooking();
                bus1.ticketBooking();
            }
            else if (x == "book plane" || x == "Book Plane" || x == "Book plane")
            {
                AirBooking air1 = new AirBooking();
                air1.ticketBooking();

            }

            if (y == "book bus" || y == "Book Bus" || y == "Book bus")
            {
                BusBooking bus1 = new BusBooking();
                bus1.ticketBooking();
            }
            else if (y == "book plane" || y == "Book Plane" || y == "Book plane")
            {
                AirBooking air1 = new AirBooking();
                air1.ticketBooking();

            }
        }
    }

}
