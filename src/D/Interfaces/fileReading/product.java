package D.Interfaces.fileReading;

public class product {

        private String name;
        private Double price;
        private Integer  quant;

    public product (){};
    public product(String name, Double price, Integer quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
    }
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuant() {
        return quant;
    }

    public Double finalValue( ){
        return  price * quant;
    }

}

