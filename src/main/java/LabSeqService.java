import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class LabSeqService {
    private final Map<Integer, Long> cache = new HashMap<>();

    public long getLabSeqValue(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Índice inválido: " + n);
        }

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 0;
        if (n == 3) return 1;
        if (cache.containsKey(n)) return cache.get(n);
        long result = getLabSeqValue(n - 4) + getLabSeqValue(n - 3);
        cache.put(n, result);
        return result;


    }
}
