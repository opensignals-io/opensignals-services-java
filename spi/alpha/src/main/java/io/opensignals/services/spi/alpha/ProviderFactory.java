/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.opensignals.services.spi.alpha;

import io.humainary.signals.services.spi.ServicesProvider;
import io.humainary.spi.Providers.Factory;

/**
 * The SPI provider factory implementation of {@link ServicesProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

public final class ProviderFactory
  implements Factory< ServicesProvider > {

  @Override
  public ServicesProvider create () {

    return
      new Provider ();

  }

}
