/**
 * 
 */
package vn.cloud.orderservice;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name = "orders", schema = "orders")
@Getter
@NoArgsConstructor
public class Order {

	@Id
	Long id;

	@Column(name = "customer_id")
	Long customerId;

	@Column(name = "order_date")
	ZonedDateTime orderDate;

	@Column(name = "total_amount")
	BigDecimal totalAmount;

}
