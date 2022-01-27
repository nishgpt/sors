package com.github.nishant141077.sors.models.investment.impl;

import com.github.nishant141077.sors.models.investment.Investment;
import com.github.nishant141077.sors.models.investment.InvestmentState;
import com.github.nishant141077.sors.models.investment.InvestmentType;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MutualFundInvestment extends Investment {

  @NotBlank
  private String company;

  @Builder
  public MutualFundInvestment(String name, String investmentId, InvestmentState state,
      String company, Date createdAt, Date updatedAt) {
    super(InvestmentType.MUTUAL_FUND, name, investmentId, state, createdAt, updatedAt);

    this.company = company;
  }
}
