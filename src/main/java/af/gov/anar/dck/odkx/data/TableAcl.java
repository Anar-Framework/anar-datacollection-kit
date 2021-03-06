package af.gov.anar.dck.odkx.data;

public class TableAcl implements Comparable<TableAcl> {

    private Scope scope;

    private TableRole role;

    public TableAcl(TableRole role) {
        this();
        this.role = role;
    }

    public TableAcl() {
        this.scope = Scope.EMPTY_SCOPE;
    }

    /**
     * @return the scope
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * @param scope the scope to set
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * @return the role
     */
    public TableRole getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(TableRole role) {
        this.role = role;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TableAcl)) {
            return false;
        }
        TableAcl other = (TableAcl) obj;
        return (role == null ? other.role == null : role.equals(other.role))
                && (scope == null ? other.scope == null : scope.equals(other.scope));
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TableAcl [scope=");
        builder.append(scope);
        builder.append(", role=");
        builder.append(role);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int compareTo(TableAcl arg0) {
        if (arg0 == null) {
            return -1;
        }
        int outcome = this.getRole().compareTo(arg0.getRole());
        if (outcome != 0) {
            return outcome;
        }
        outcome = this.getScope().compareTo(arg0.getScope());
        return outcome;
    }

}
