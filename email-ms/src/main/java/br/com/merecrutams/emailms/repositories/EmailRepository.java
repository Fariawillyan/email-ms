package br.com.merecrutams.emailms.repositories;

import br.com.merecrutams.emailms.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
