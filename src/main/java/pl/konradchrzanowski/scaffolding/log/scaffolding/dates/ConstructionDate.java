package pl.konradchrzanowski.scaffolding.log.scaffolding.dates;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "construction_date")
public class ConstructionDate {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "assembly_date_id")
        private Long assemblyDateId;
        @Column(name = "assembly_date")
        private LocalDate assemblyDate;

        public ConstructionDate(LocalDate assemblyDate) {
                this.assemblyDate = assemblyDate;
        }

        public Long getAssemblyDateId() {
                return assemblyDateId;
        }

        public LocalDate getAssemblyDate() {
                return assemblyDate;
        }
}
