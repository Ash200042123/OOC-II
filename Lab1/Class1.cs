using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public abstract class Booking
    {
        public abstract void ticketBooking();
    }

    public class AirBooking:Booking
    {
        public override void ticketBooking()
        {
            Console.WriteLine("Air ticket booked");
        }
    }

    public class BusBooking : Booking
    {
        public override void ticketBooking()
        {
            Console.WriteLine("Bus ticket booked");
        }
    }
}
