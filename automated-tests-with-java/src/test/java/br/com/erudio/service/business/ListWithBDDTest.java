package br.com.erudio.service.business;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListWithBDDTest {
	
	@Test
	void testMockingList_given_SizeIsCalled_ShouldReturn10() {
		
		// Given / Arrange
		List<?> list = mock(List.class);
		
		given(list.size()).willReturn(10);
		
		// given / Act & Then / Assert
		assertThat(list.size(), is(10));
	}
	
	@Test
	void testMockingList_given_SizeIsCalled_ShouldReturnMultipleValues() {
		
		// Given / Arrange
		List<?> list = mock(List.class);
		
		given(list.size()).willReturn(10).willReturn(20);
		
		// given / Act & Then / Assert
		assertThat(list.size(), is(10));
		
		assertThat(list.size(), is(20));
		
		assertThat(list.size(), is(20));
	}
	
	@Test
	void testMockingList_given_GetIsCalled_ShouldReturnErudio() {
		
		// Given / Arrange
		var list = mock(List.class);
		
		given(list.get(0)).willReturn("Erudio");
		
		// given / Act & Then / Assert
		assertThat(list.get(0), is("Erudio"));
		
		assertNull(list.get(1));
	}
	
	@Test
	void testMockingList_given_GetIsCalledWithArgumentMatcher_ShouldReturnErudio() {
		
		// Given / Arrange
		var list = mock(List.class);
		
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		given(list.get(anyInt())).willReturn("Erudio");
		
		// given / Act & Then / Assert
		assertThat(list.get(anyInt()), is("Erudio"));
		
		assertThat(list.get(anyInt()), is("Erudio"));
	}
	
	@Test
	void testMockingList_given_ThrowsAnException() {
		
		// Given / Arrange
		var list = mock(List.class);
		
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		given(list.get(anyInt())).willThrow(new RuntimeException("Foo Bar!!"));
		
		// given / Act & Then / Assert
		assertThrows(
			RuntimeException.class, 
			
			// given / Act
			() -> {list.get(anyInt());},
			() -> "Should have throw an RuntimeException"
		);
	}
}
