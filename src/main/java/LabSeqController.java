import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabSeqController {
    @Autowired
    private LabSeqService labSeqService;

    @GetMapping("/labseq/{n}")
    public long getLabSeqValue(@PathVariable int n) {
        return labSeqService.getLabSeqValue(n);
    }
}
