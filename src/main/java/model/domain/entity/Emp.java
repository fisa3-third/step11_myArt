package model.domain.entity;
import java.util.*;
import javax.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
public class Emp {
	@Id
	private Long empno;
	
	@NonNull
	@Column(length = 40,  nullable = false)
	private String ename;
	
	@NonNull
	@Column(length = 40,  nullable = false)
	private String job;
	
	private Long mgr;
	
	@NonNull
	@Column(name ="hiredate", nullable = false)
	private Date hdate;
	
	@NonNull
	@Column(nullable = false)
	private Long sal;
	
	private Long comm;
	
	@NonNull
	@ManyToOne
	@JoinColumn(name="deptno")
	private Dept deptno;

}