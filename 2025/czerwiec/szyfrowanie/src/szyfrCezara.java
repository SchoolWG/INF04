public class szyfrCezara {
    /**
     *
     * @param tJawny
     * @param klucz
     * @return
     */

    String szyfruj(String tJawny, int klucz){

        StringBuilder tZasz= new StringBuilder();
        klucz = klucz%26;

        for(char z : tJawny.toCharArray()){
            if(z!=' ') {

                if (z + klucz > 'z') {
                    tZasz.append((char) ((z + klucz - 'z') + 'a'-1));
                } else if (z + klucz < 'a') {
                    tZasz.append((char) ('z' - ('a' - (z + klucz))));
                } else {
                    tZasz.append((char) (z + klucz));
                }
            }else tZasz.append(' ');
        }

        return tZasz.toString();
    }
}
