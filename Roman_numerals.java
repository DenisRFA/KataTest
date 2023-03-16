public enum Roman_numerals {
    I(1,"I"),II(2,"II"),III(3,"III"),IV(4,"IV"),V(5,"V"),VI(6,"VI"),VII(7,"VII"),VIII(8,"VIII"),IX(9,"IX"),X(10,"X");
    private int arabian;
    private String rome;
    Roman_numerals(int trans, String num){
        this.arabian=trans;
        this.rome=num;
    }
    Roman_numerals(String num){
        this.rome=num;
    }
    Roman_numerals(int trans){
        this.arabian=trans;
    }
    public int getArabian(){
        return arabian;
    }
    public String getRome(){return rome;}
}
