package com.order.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.orderdetails.dto.AddressDto;
import com.orderdetails.dto.OrderDto;
import com.orderdetails.dto.OrderLineDto;
import com.orderdetails.entity.Order;
import com.orderdetails.repository.OrderDetailsRepository;
import com.orderdetails.service.OrderDetailsService;

@ExtendWith(MockitoExtension.class)
public class OrderDetailsServiceTest {

	@InjectMocks
	OrderDetailsService orderDetailsService;
	@Mock
	OrderDetailsRepository repo;

	OrderDto orderDto = new OrderDto();
	Order order = new Order();

	Long orderId = 3L;
	int pincode = 560068;

	@BeforeEach
	void iniOrderDetailsServiceTest() {
		order.setId(0);

		LocalDate date = LocalDate.now();
		order.setOrderDate(date);
		order.setOrderstatus("ACTIVE");
		order.setTotalAmount(150000);
	}

	@Test
	@DisplayName("getOrderByPincode")
	void testgetOrderByPincode() {
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order);
		when(repo.findByOrderLines_Address_Pincode((560068))).thenReturn(orderList);
		List<Order> orderList1 = orderDetailsService.getOrderByPincode(pincode);
		assertEquals("ACTIVE", orderList1.get(0).getOrderstatus());

	}

	@Test
	@DisplayName("getOrderById")
	void testGetOrderById() {
		when(repo.findById((3L))).thenReturn(Optional.of(order));
		Order o = orderDetailsService.getOrderById(3L);
		assertEquals(LocalDate.now(), o.getOrderDate());

	}

	@Test
	@DisplayName("save in order detatils")
	void testorderDetailsSave() {

		orderDto.setOrderDate("10-12-2022");
		orderDto.setOrderStatus("ACTIVE");
		orderDto.setTotalAmount(12.0);
		List<OrderLineDto> lineDtos = new ArrayList<>();
		OrderLineDto lineDto = new OrderLineDto();
		lineDto.setEta("eta");
		AddressDto adto = new AddressDto();
		lineDto.setAddress(adto);
		lineDtos.add(lineDto);
		orderDto.setOrderLines(lineDtos);
		when(repo.save(any())).thenReturn(order);
		Order order1 = orderDetailsService.saveorderdetails(orderDto);
		assertEquals(LocalDate.now(), order1.getOrderDate());
	}

}