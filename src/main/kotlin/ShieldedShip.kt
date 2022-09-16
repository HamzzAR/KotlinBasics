class ShieldedShip: Fighter() {
    var shieldStrength = 25
    override fun wasHit() {
        if (shieldStrength > 0) {
            shieldStrength -= 5
        } else {
            super.wasHit()
        }
    }
}