-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

-------------- API --------------
@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estu_id")
    private Integer id;

    @Column(name = "estu_nombre")
}

public interface IEstudianteRepo {
    public Estudiante seleccionarPorId(Integer id);
    public List<Estudiante> seleccionarTodos(String genero);
    public void actualizarPorId(Estudiante estudiante);
    public void actualizarParcialPorId(Estudiante estudiante);
    public void borrarPorId(Integer id);
    public void insertar(Estudiante estudiante);
}

@Transactional
@ApplicationScoped
public class EstudianteRepoImpl implements IEstudianteRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Estudiante> seleccionarTodos(String genero) {
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.genero =: genero", Estudiante.class);
        myQuery.setParameter("genero", genero);
        return myQuery.getResultList();
    }

}

public interface IEstudianteService {
    public Estudiante buscarPorId(Integer id);
    public List<Estudiante> buscarTodos(String genero);
    public void actualizarPorId(Estudiante estudiante);
    public void actualizarParcialPorId(Estudiante estudiante);
    public void borrarPorId(Integer id);
    public void guardar(Estudiante estudiante);
}

@ApplicationScoped
public class EstudianteServiceImpl implements IEstudianteService {

    @Inject
    private IEstudianteRepo estudianteRepo;

}

@