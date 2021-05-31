import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class SearchSuggestionSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<String> productList = Arrays.asList(products);
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> nextProductList = new ArrayList<>();

            char c = searchWord.charAt(i);
            for (String product : productList) {
                if (i < product.length() && c == product.charAt(i)) nextProductList.add(product);
            }

            result.add(nextProductList.subList(0, Math.min(3, nextProductList.size())));
            productList = nextProductList;
        }
        return result;
    }
}
