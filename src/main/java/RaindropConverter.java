class RaindropConverter {

    String convert(int number) {
        String res = "";
        if(number % 3 == 0){
            res += "Pling";
        }else if(number % 5 == 0){
            res += "Plang";
        }else if(number % 7 == 0){
            res += "Plong";
        }

        if(res.isEmpty()){
            return Integer.toString(number);
        }

        return res;
    }

}