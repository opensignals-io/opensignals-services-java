/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.opensignals.services.spi.alpha;

import io.humainary.signals.services.Services;
import io.humainary.signals.services.spi.ServicesProvider;
import io.humainary.substrates.sdk.AbstractContextProvider;

import static io.humainary.signals.services.Services.*;

/**
 * The SPI implementation of {@link ServicesProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

final class Provider
  extends AbstractContextProvider< Services.Service, Context >
  implements ServicesProvider {

  Provider () {

    super (
      environment ->
        new Context (
          environment,
          Service::new
        )
    );

  }

  @Override
  public Signlet signlet (
    final Orientation orientation,
    final Signal signal
  ) {

    return
      Signlets.of (
        orientation,
        signal
      );

  }

}
