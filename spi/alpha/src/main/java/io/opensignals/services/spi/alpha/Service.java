package io.opensignals.services.spi.alpha;

import io.humainary.signals.services.Services;
import io.humainary.signals.services.Services.Orientation;
import io.humainary.signals.services.Services.Signal;
import io.humainary.signals.services.Services.Signlet;
import io.humainary.substrates.Substrates.Inlet;
import io.humainary.substrates.sdk.AbstractInstrument;

import static io.humainary.signals.services.Services.Orientation.EMIT;
import static io.humainary.signals.services.Services.Orientation.RECEIPT;
import static io.opensignals.services.spi.alpha.Signlets.*;

final class Service
  extends AbstractInstrument< Signlet >
  implements Services.Service {

  Service (
    final Inlet< Signlet > inlet
  ) {

    super (
      inlet
    );

  }

  private Service dispatch (
    final Signlet signlet
  ) {

    signal (
      signlet
    );

    return
      this;

  }

  @Override
  public void signal (
    final Signlet signlet
  ) {

    inlet.emit (
      signlet
    );

  }

  @Override
  public void signal (
    final Orientation orientation,
    final Signal signal
  ) {

    signal (
      of (
        orientation,
        signal
      )
    );

  }

  @Override
  public void emit (
    final Signal signal
  ) {

    signal (
      of (
        EMIT,
        signal
      )
    );

  }

  @Override
  public void receipt (
    final Signal signal
  ) {

    signal (
      of (
        RECEIPT,
        signal
      )
    );

  }

  @Override
  public void receipt (
    final Signal first,
    final Signal second
  ) {

    signal (
      of (
        RECEIPT,
        first
      )
    );

    signal (
      of (
        RECEIPT,
        second
      )
    );

  }

  @Override
  public void emit (
    final Signal first,
    final Signal second
  ) {

    signal (
      of (
        EMIT,
        first
      )
    );

    signal (
      of (
        EMIT,
        second
      )
    );

  }

  @Override
  public Service succeed (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        SUCCEED :
        SUCCEEDED
      );

  }

  @Override
  public Service succeed () {

    return
      dispatch (
        SUCCEED
      );

  }

  @Override
  public Service succeeded () {

    return
      dispatch (
        SUCCEEDED
      );

  }

  @Override
  public Service fail (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        FAIL :
        FAILED
      );

  }

  @Override
  public Service fail () {

    return
      dispatch (
        FAIL
      );

  }

  @Override
  public Service failed () {

    return
      dispatch (
        FAILED
      );

  }

  @Override
  public Service elapse (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        ELAPSE :
        ELAPSED
      );

  }

  @Override
  public Service elapse () {

    return
      dispatch (
        ELAPSE
      );

  }

  @Override
  public Service elapsed () {

    return
      dispatch (
        ELAPSED
      );

  }

  @Override
  public Service drop (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        DROP :
        DROPPED
      );

  }

  @Override
  public Service drop () {

    return
      dispatch (
        DROP
      );

  }

  @Override
  public Service dropped () {

    return
      dispatch (
        DROPPED
      );

  }

  @Override
  public Service reject (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        REJECT :
        REJECTED
      );

  }

  @Override
  public Service reject () {

    return
      dispatch (
        REJECT
      );

  }

  @Override
  public Service rejected () {

    return
      dispatch (
        REJECTED
      );

  }

  @Override
  public Service retry (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        RETRY :
        RETRIED
      );

  }

  @Override
  public Service retry () {

    return
      dispatch (
        RETRY
      );

  }

  @Override
  public Service retried () {

    return
      dispatch (
        RETRIED
      );

  }

  @Override
  public Service disconnect (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        DISCONNECT :
        DISCONNECTED
      );

  }

  @Override
  public Service disconnect () {

    return
      dispatch (
        DISCONNECT
      );

  }

  @Override
  public Service disconnected () {

    return
      dispatch (
        DISCONNECTED
      );

  }

  @Override
  public Service call (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        CALL :
        CALLED
      );

  }

  @Override
  public Service call () {

    return
      dispatch (
        CALL
      );

  }

  @Override
  public Service called () {

    return
      dispatch (
        CALLED
      );

  }

  @Override
  public Service start (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        START :
        STARTED
      );

  }

  @Override
  public Service start () {

    return
      dispatch (
        START
      );

  }

  @Override
  public Service started () {

    return
      dispatch (
        STARTED
      );

  }

  @Override
  public Service stop (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        STOP :
        STOPPED
      );

  }

  @Override
  public Service stop () {

    return
      dispatch (
        STOP
      );

  }

  @Override
  public Service stopped () {

    return
      dispatch (
        STOPPED
      );

  }

  @Override
  public Service recourse (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        RECOURSE :
        RECOURSED
      );

  }

  @Override
  public Service recourse () {

    return
      dispatch (
        RECOURSE
      );

  }

  @Override
  public Service recoursed () {

    return
      dispatch (
        RECOURSED
      );

  }

  @Override
  public Service redirect (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        REDIRECT :
        REDIRECTED
      );

  }

  @Override
  public Service redirect () {

    return
      dispatch (
        REDIRECT
      );

  }

  @Override
  public Service redirected () {

    return
      dispatch (
        REDIRECTED
      );

  }

  @Override
  public Service delay (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        DELAY :
        DELAYED
      );

  }

  @Override
  public Service delay () {

    return
      dispatch (
        DELAY
      );

  }

  @Override
  public Service delayed () {

    return
      dispatch (
        DELAYED
      );

  }

  @Override
  public Service schedule (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        SCHEDULE :
        SCHEDULED
      );

  }

  @Override
  public Service schedule () {

    return
      dispatch (
        SCHEDULE
      );

  }

  @Override
  public Service scheduled () {

    return
      dispatch (
        SCHEDULED
      );

  }

  @Override
  public Service suspend (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        SUSPEND :
        SUSPENDED
      );

  }

  @Override
  public Service suspend () {

    return
      dispatch (
        SUSPEND
      );

  }

  @Override
  public Service suspended () {

    return
      dispatch (
        SUSPENDED
      );

  }

  @Override
  public Service resume (
    final Orientation orientation
  ) {

    return
      dispatch (
        orientation == EMIT ?
        RESUME :
        RESUMED
      );

  }

  @Override
  public Service resume () {

    return
      dispatch (
        RESUME
      );

  }

  @Override
  public Service resumed () {

    return
      dispatch (
        RESUMED
      );

  }

}

