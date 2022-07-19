/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.opensignals.services.spi.alpha;

import io.humainary.signals.services.Services;
import io.humainary.signals.services.Services.Signlet;
import io.humainary.substrates.Substrates.Environment;
import io.humainary.substrates.Substrates.Name;
import io.humainary.substrates.Substrates.Type;
import io.humainary.substrates.sdk.AbstractContext;

import static io.humainary.signals.services.Services.Service.TYPE;

/**
 * The SPI implementation of {@link Services.Context}.
 *
 * @author wlouth
 * @since 1.0
 */

final class Context
  extends AbstractContext< Services.Service, Signlet >
  implements Services.Context {


  Context (
    final Environment environment,
    final Producer< ? extends Services.Service, Signlet > producer
  ) {

    super (
      environment,
      producer
    );

  }

  @Override
  protected Type type () {

    return
      TYPE;

  }


  @Override
  public Services.Service service (
    final Name name
  ) {

    return
      instrument (
        name
      );

  }

}
