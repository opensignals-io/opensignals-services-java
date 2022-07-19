/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.opensignals.services.spi.alpha;

import io.humainary.signals.services.Services;
import io.humainary.signals.services.Services.Orientation;
import io.humainary.signals.services.Services.Signal;

import static io.humainary.signals.services.Services.Orientation.EMIT;
import static io.humainary.signals.services.Services.Orientation.RECEIPT;


final class Signlets {

  private Signlets () {}

  private static final Services.Signlet[][] SIGNALS = new Services.Signlet[2][16];

  static final Services.Signlet START        = signlet ( EMIT, Signal.START );
  static final Services.Signlet STOP         = signlet ( EMIT, Signal.STOP );
  static final Services.Signlet CALL         = signlet ( EMIT, Signal.CALL );
  static final Services.Signlet SUCCEED      = signlet ( EMIT, Signal.SUCCEED );
  static final Services.Signlet FAIL         = signlet ( EMIT, Signal.FAIL );
  static final Services.Signlet RECOURSE     = signlet ( EMIT, Signal.RECOURSE );
  static final Services.Signlet REDIRECT     = signlet ( EMIT, Signal.REDIRECT );
  static final Services.Signlet ELAPSE       = signlet ( EMIT, Signal.ELAPSE );
  static final Services.Signlet RETRY        = signlet ( EMIT, Signal.RETRY );
  static final Services.Signlet REJECT       = signlet ( EMIT, Signal.REJECT );
  static final Services.Signlet DROP         = signlet ( EMIT, Signal.DROP );
  static final Services.Signlet DELAY        = signlet ( EMIT, Signal.DELAY );
  static final Services.Signlet SCHEDULE     = signlet ( EMIT, Signal.SCHEDULE );
  static final Services.Signlet SUSPEND      = signlet ( EMIT, Signal.SUSPEND );
  static final Services.Signlet RESUME       = signlet ( EMIT, Signal.RESUME );
  static final Services.Signlet DISCONNECT   = signlet ( EMIT, Signal.DISCONNECT );
  static final Services.Signlet STARTED      = signlet ( RECEIPT, Signal.START );
  static final Services.Signlet STOPPED      = signlet ( RECEIPT, Signal.STOP );
  static final Services.Signlet CALLED       = signlet ( RECEIPT, Signal.CALL );
  static final Services.Signlet SUCCEEDED    = signlet ( RECEIPT, Signal.SUCCEED );
  static final Services.Signlet FAILED       = signlet ( RECEIPT, Signal.FAIL );
  static final Services.Signlet RECOURSED    = signlet ( RECEIPT, Signal.RECOURSE );
  static final Services.Signlet REDIRECTED   = signlet ( RECEIPT, Signal.REDIRECT );
  static final Services.Signlet ELAPSED      = signlet ( RECEIPT, Signal.ELAPSE );
  static final Services.Signlet RETRIED      = signlet ( RECEIPT, Signal.RETRY );
  static final Services.Signlet REJECTED     = signlet ( RECEIPT, Signal.REJECT );
  static final Services.Signlet DROPPED      = signlet ( RECEIPT, Signal.DROP );
  static final Services.Signlet DELAYED      = signlet ( RECEIPT, Signal.DELAY );
  static final Services.Signlet SCHEDULED    = signlet ( RECEIPT, Signal.SCHEDULE );
  static final Services.Signlet SUSPENDED    = signlet ( RECEIPT, Signal.SUSPEND );
  static final Services.Signlet RESUMED      = signlet ( RECEIPT, Signal.RESUME );
  static final Services.Signlet DISCONNECTED = signlet ( RECEIPT, Signal.DISCONNECT );


  public static Services.Signlet of (
    final Orientation orientation,
    final Signal signal
  ) {

    return
      SIGNALS
        [orientation.ordinal ()]
        [signal.ordinal ()];

  }


  private static Services.Signlet signlet (
    final Orientation orientation,
    final Signal signal
  ) {

    return
      SIGNALS
        [orientation.ordinal ()]
        [signal.ordinal ()] =
        new Signlet (
          orientation,
          signal
        );

  }


  private record Signlet(
    Orientation orientation,
    Signal signal
  ) implements Services.Signlet {

    @Override
    public String toString () {
      return "Signlet{" +
        "orientation=" + orientation +
        ", signal=" + signal +
        '}';
    }
  }

}
