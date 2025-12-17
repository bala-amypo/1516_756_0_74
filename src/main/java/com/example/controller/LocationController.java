@RestController
public class ServiceController{
    @Autowired
    LocationService locationservice;
    @PostMapping("/addlocation");
    public LocationEntity add(@RequestBody LocationEntity)

}