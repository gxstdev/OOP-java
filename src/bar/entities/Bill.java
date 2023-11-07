package bar.entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double feeding(){
        return beer * 5.00 + barbecue * 7.00 + softDrink * 3.00;
    }
    public double cover(){
        if (feeding() > 30.00){
            return 0.00;
        }
        return 4.00;
    }
    public double ticket(){
        if (gender == 'F' || gender == 'f'){
            return 8.00;
        }
        return 10.00;
    }
    public double total(){
        return feeding() + cover() + ticket();
    }

    @Override
    public String toString() {
        if (cover() > 0.00){
            return String.format("RELATÓRIO:\nConsumo = R$ %.2f\nCouvert = R$ %.2f\n" +
                    "Ingresso = R$ %.2f\n\nValor a pagar = R$ %.2f",
                    feeding(), cover(), ticket(), total());
        }
        return String.format("RELATÓRIO:\nConsumo = R$ %.2f\nIsento de Couvert\n" +
                        "Ingresso = R$ %.2f\n\nValor a pagar = R$ %.2f",
                feeding(), ticket(), total());
    }
}
