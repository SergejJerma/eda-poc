package com.eda.poc;

import com.eda.poc.service.LoggerService;
import com.eda.poc.service.UserSessionManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class EdaPocApplicationTests {
	@Autowired
	private UserSessionManager userSessionManager;
	@Autowired
	private LoggerService loggerService;

	@Test
	void testUserLoginAndLogoutEvents() {
		userSessionManager.login("Jay");
		userSessionManager.logout("Jay");

		List<String> logs = loggerService.getLogMessages();
		assertThat(logs).containsExactly("EVENT: User logged in - Jay", "EVENT: User logged out - Jay");
	}

}
