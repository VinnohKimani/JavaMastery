package OOP;

class Arrays{
    public static void main(String[] args){
        String [] fruits = {"apple", "orange", "banana", "pineapple"};

//        System.out.println(fruits[0]);

//        for(int i = 0; i < fruits.length; i++ ){
//            System.out.println(fruits[i]);
//        }

//        Enhanced for loop
//        For every fruit in my array of fruits do this: ...
        for(String fruit: fruits){
            System.out.printf(fruit);
        }
    }
}