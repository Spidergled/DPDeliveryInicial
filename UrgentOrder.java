
/**
 * Write a description of class UrgentOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UrgentOrder extends Order
{
        public UrgentOrder(String sendingName, Location location, Location destination, int deliveryTime,
                       double weight, String destinationName, Surcharge surcharge, Urgency urgency) {
        super(sendingName, location, destination, deliveryTime, weight, destinationName, surcharge, urgency);
    }

    @Override
    public double charge() {
        return getSurcharge().getValor() * 2; 
    }

    @Override
    public int calculateEvaluationDP() {
        int evaluation = 10;
        addDeliveryPersonEvaluation(evaluation); 
        return evaluation;
    }
}